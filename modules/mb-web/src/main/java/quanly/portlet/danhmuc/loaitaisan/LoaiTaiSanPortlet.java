package quanly.portlet.danhmuc.loaitaisan;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import org.osgi.service.component.annotations.Component;

import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.mb.exception.TrungMaException;
import com.mb.exception.TrungSoCMNDException;
import com.mb.model.LoaiTaiSan;
import com.mb.service.LoaiTaiSanLocalServiceUtil;

import quanly.constants.QuanlyPortletKeys;

/**
 * @author Annn
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/html/danhmuc/loaitaisan/view.jsp",
		"javax.portlet.display-name=" + QuanlyPortletKeys.loaiTaiSan, "javax.portlet.name=" + QuanlyPortletKeys.loaiTaiSan,
		"javax.portlet.resource-bundle=content.Language",
		"com.liferay.portlet.footer-portlet-javascript=/plugins/toastr/toastr.min.js",
		"com.liferay.portlet.footer-portlet-css=/plugins/toastr/toastr.min.css",
		"com.liferay.portlet.footer-portlet-javascript=/plugins/jquery/jquery-3.2.1.min.js",
		"com.liferay.portlet.footer-portlet-javascript=/plugins/jquery/jquery.priceformat.js",
		"com.liferay.portlet.footer-portlet-javascript=/plugins/jquery/jquery.ui.datepicker-vi.js",
		"com.liferay.portlet.footer-portlet-javascript=/plugins/jquery-ui/jquery-ui.min.js",
		"com.liferay.portlet.footer-portlet-css=/plugins/jquery-ui/jquery-ui.min.css",
		"javax.portlet.security-role-ref=power-user,user",
		"com.liferay.portlet.footer-portlet-javascript=/js/main.js", }, service = Portlet.class)
public class LoaiTaiSanPortlet extends MVCPortlet {
	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		String resourceId = resourceRequest.getResourceID();
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		ServiceContext serviceContext = new ServiceContext();
		ThemeDisplay themeDisplay = (ThemeDisplay) resourceRequest.getAttribute(WebKeys.THEME_DISPLAY);
		serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
		serviceContext.setCompanyId(themeDisplay.getCompanyGroupId());
		serviceContext.setUserId(themeDisplay.getUserId());
		if (resourceId.equals("addURL")) {
			kq = addURL(resourceRequest, resourceResponse, serviceContext);
		} else if (resourceId.equals("hoatDongURL")) {
			kq = hoatDongURL(resourceRequest, resourceResponse, serviceContext);
		}
		PrintWriter writer = resourceResponse.getWriter();
		writer.print(kq.toString());
		writer.flush();
		writer.close();

	}

	public JSONObject hoatDongURL(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			ServiceContext serviceContext) {
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		try {
			long loaiTaiSanId = ParamUtil.getLong(resourceRequest, "loaiTaiSanId");
			if (loaiTaiSanId > 0) {
				LoaiTaiSan lts = LoaiTaiSanLocalServiceUtil.fetchLoaiTaiSan(loaiTaiSanId);
				lts.setHoatDong(!lts.getHoatDong());
				LoaiTaiSanLocalServiceUtil.updateLoaiTaiSan(lts, serviceContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}

	public JSONObject addURL(ResourceRequest resourceRequest, ResourceResponse resourceResponse,
			ServiceContext serviceContext) {
		JSONObject kq = JSONFactoryUtil.createJSONObject();
		try {
			long loaiTaiSanId = ParamUtil.getLong(resourceRequest, "loaiTaiSanId");
			String ten = ParamUtil.getString(resourceRequest, "ten");
			String ma = ParamUtil.getString(resourceRequest, "ma");
			String ghiChu = ParamUtil.getString(resourceRequest, "ghiChu");
			LoaiTaiSan lts = LoaiTaiSanLocalServiceUtil.createLoaiTaiSan(0L);
			boolean hoatDong = true;
			if (loaiTaiSanId > 0) {
				lts = LoaiTaiSanLocalServiceUtil.fetchLoaiTaiSan(loaiTaiSanId);
				hoatDong = lts.getHoatDong();
			}
			lts.setTen(ten);
			lts.setMa(ma);
			lts.setGhiChu(ghiChu);
			lts.setHoatDong(hoatDong);
			LoaiTaiSanLocalServiceUtil.addOrUpdateLoaiTaiSan(lts, serviceContext);
		} catch (TrungSoCMNDException e) {
			kq.putException(e);
		} catch (TrungMaException e) {
			kq.putException(e);
		} catch (Exception e) {
			e.printStackTrace();
			kq.putException(e);
		}
		return kq;
	}
}