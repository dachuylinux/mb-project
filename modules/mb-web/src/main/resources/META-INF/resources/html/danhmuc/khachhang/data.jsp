<%@page import="com.mb.service.KhachHangLocalServiceUtil"%>
<%@page import="com.mb.model.KhachHang"%>
<%@page import="quanly.portlet.danhmuc.khachhang.KhachHangComparator"%>
<%@page import="com.liferay.portal.kernel.util.Validator"%>
<%@page import="com.liferay.portal.kernel.portlet.LiferayWindowState"%>
<%@page import="java.text.DecimalFormat"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@ include file="/html/danhmuc/init.jsp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%	
	String maSearch = ParamUtil.getString(request, "maSearch");
	String maCTVSearch = ParamUtil.getString(request, "maCTVSearch");
	String hoTenSearch = ParamUtil.getString(request, "hoTenSearch");
	String soCMNDSearch = ParamUtil.getString(request, "soCMNDSearch");
	String diaChiSearch = ParamUtil.getString(request, "diaChiSearch");
	int hoatDongSearch = ParamUtil.getInteger(request, "hoatDongSearch");
	int count = KhachHangLocalServiceUtil.countBase(maSearch, maCTVSearch, hoTenSearch, soCMNDSearch, diaChiSearch, hoatDongSearch);
	DecimalFormat df = new DecimalFormat("###,###.###");
%>
<liferay-portlet:renderURL varImpl="iteratorURL">
	<portlet:param name="maSearch" value="<%= maSearch %>" />
	<portlet:param name="maCTVSearch" value="<%= maCTVSearch %>" />
	<portlet:param name="hoTenSearch" value="<%= hoTenSearch %>" />
	<portlet:param name="soCMNDSearch" value="<%= soCMNDSearch %>" />
	<portlet:param name="diaChiSearch" value="<%= diaChiSearch %>" />
	<portlet:param name="hoatDongSearch" value="<%= String.valueOf(hoatDongSearch)%>" />
	<portlet:param name="mvcPath" value="/html/danhmuc/khachhang/data.jsp" />
</liferay-portlet:renderURL>
<div id="<portlet:namespace />recordSearchContainer">
	<liferay-ui:search-container  delta="20"  emptyResultsMessage="Không có kết quả nào được tìm thấy!" iteratorURL="<%=iteratorURL %>" total="<%=count %>" >
		 <%
		 	String orderByType = ParamUtil.getString(request, "orderByType"); 
		 	String orderByCol = ParamUtil.getString(request, "orderByCol"); 
		 	if(Validator.isNull(orderByType)){
		 		orderByType = "desc";
		 	}
		 	if(Validator.isNull(orderByCol)){
		 		orderByCol = "createdate";
		 	}
		 	boolean ascending = true;
		 	if("desc".equals(orderByType)){
		 		ascending = false;
		 	}
		 	KhachHangComparator obc = new KhachHangComparator(orderByCol,ascending);
		 	searchContainer.setOrderByCol(orderByCol);
		 	searchContainer.setOrderByType(orderByType);
		 	searchContainer.setOrderByComparator(obc);
		 
			List<KhachHang> items = KhachHangLocalServiceUtil.findBase(maSearch, maCTVSearch, hoTenSearch, soCMNDSearch, diaChiSearch, hoatDongSearch, searchContainer.getStart(), searchContainer.getEnd(), searchContainer.getOrderByComparator());
		 %>
		 <liferay-ui:search-container-results results="<%= items %>" />
		 <liferay-ui:search-container-row className="com.mb.model.KhachHang" modelVar="khachHang" keyProperty="khachHangId" > 
			<portlet:renderURL var="editURL" windowState="<%=LiferayWindowState.POP_UP.toString()%>">
				<portlet:param name="mvcPath" value="/html/danhmuc/khachhang/add_kh.jsp" />
				<portlet:param name="khachHangId" value="<%=String.valueOf(khachHang.getKhachHangId())%>" />
			</portlet:renderURL>
			<portlet:resourceURL var="hoatDongURL" id="hoatDongURL">
				<portlet:param name="khachHangId" value="<%=String.valueOf(khachHang.getKhachHangId())%>" />
			</portlet:resourceURL>
				<%
					String editAction = "openDialogEdit('" + editURL + "');";
					String hoatDongAction = "hoatDong('" + hoatDongURL + "');";
			 	%>
		 
			 <liferay-ui:search-container-column-text cssClass="aui-w10 text-center" name="Mã" value="${khachHang.ma} " orderable="true" orderableProperty="ma"/>
			 <liferay-ui:search-container-column-text cssClass="aui-w20 text-center" name="Họ tên" orderable="true" orderableProperty="hoTen" > 
			 	<span style="color:#ff3d00e8" >${ khachHang.hoTen}</span>
			 </liferay-ui:search-container-column-text>
			 <liferay-ui:search-container-column-text cssClass="aui-w15 text-center" name="Số CMND" value="${khachHang.soCMND} " orderable="true" orderableProperty="soCMND" /> 
			  <liferay-ui:search-container-column-text cssClass="aui-w15 text-center" name="Cộng tác viên">
			  	<span style="color:blue" >${ khachHang.congTacVien.hoTen}</span>
			  	<br/>
			  	<span style="color:#ff3d00e8" >( Mã : ${ khachHang.maCTV})</span>
			   </liferay-ui:search-container-column-text>
			 <liferay-ui:search-container-column-text cssClass="text-center" name="Địa chỉ" value="${khachHang.diaChi}" orderableProperty="diaChi" orderable="true"/>
			  <liferay-ui:search-container-column-text name="Thao tác" cssClass="aui-w10 text-center">
			 	<a href="javascript:void(0);" onclick="<%=editAction %>" title="Sửa">
			 		<span style="color:#ff3d00e8"><i class="glyphicon glyphicon-edit"></i></span>
			 	</a>
			 	<a href="javascript:void(0);" onclick="<%=hoatDongAction %>" title='<%=khachHang.getHoatDong() ? "Ngưng hoạt động" : "Hoạt động" %>'>
			 		<span style='<%=khachHang.getHoatDong() ? "color:#ff3d00e8" :  "color:blue"%>'><i class='<%=khachHang.getHoatDong() ? "glyphicon glyphicon-off" : "glyphicon glyphicon-play-circle"%>'></i></span>
			 	</a>
			 </liferay-ui:search-container-column-text>
		 </liferay-ui:search-container-row >
		 <liferay-ui:search-iterator />
	</liferay-ui:search-container >
</div>

<aui:script use="aui-base,aui-io-plugin-deprecated,aui-loading-mask-deprecated">
AUI().ready(['aui-base'], function(A) {
	Liferay.Data.redirectURL = '${iteratorURL}';
	var recordSearchContainer = A.one('#<portlet:namespace />recordSearchContainer');
	var loadingMask = new A.LoadingMask(
		{
			target: recordSearchContainer
		}
	);
	var plugin = recordSearchContainer.plug(A.Plugin.IO,{
        autoLoad: false,
        failureMessage : 'Loading...'
    });
	var pageIO = plugin.io;
	recordSearchContainer.all('ul.dropdown-menu.lfr-menu-list.direction-down a').on('click', function(e) {
		console.log('123');
    	e.preventDefault();
    	Liferay.Data.redirectURL = e.currentTarget.get('href');
    	pageIO.set('uri', e.currentTarget.get('href'));
    	pageIO.start();
    });
    recordSearchContainer.all('ul.lfr-pagination-buttons.pager a').on('click', function(e) {
    	e.preventDefault();
    	Liferay.Data.redirectURL = e.currentTarget.get('href');
    	pageIO.set('uri', e.currentTarget.get('href'));
    	pageIO.start();
    });
    recordSearchContainer.all('div.table-sort-liner a').on('click', function(e) {
    	e.preventDefault();
    	Liferay.Data.redirectURL = e.currentTarget.get('href');
    	pageIO.set('uri', e.currentTarget.get('href'));
    	pageIO.start();
    });
	Liferay.provide(window,'openDialogEdit', function(url){
		Liferay.Util.openWindow({
			dialog : {
				centered : true,
				height : 600,
				modal : true,
				width : 700
			},
			id : '<portlet:namespace />dialogAdd',
			title : 'Sửa Khách hàng',
			uri : url
		});
	});
	Liferay.provide(window,'hoatDong', function(url){
		loadingMask.show();
  		if(confirm('Bạn có chắc thực hiện thao tác này?')){
  			A.io.request(url, {
               method: 'post',
               on: {
                   success: function() {
                   		if(this.get('responseData')){
                   			var data = JSON.parse(this.get('responseData'));
                   			if(!data.exception){
                   					search();
                   					toastr.success('Thêm khách hàng thành công', 'Thông báo!');
                   			}else{
                   					toastr.error('Yêu cầu thực hiện không thành công', 'Cảnh báo!');
                   			}
                   		}
                   },
                   failure : function() {
					}
              }
        	});
  		}
        loadingMask.hide();
	});
});	
</aui:script>