/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.mb.service.impl;

import java.util.Date;
import java.util.List;

import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.mb.model.LichSuThuPhatChi;
import com.mb.service.base.LichSuThuPhatChiLocalServiceBaseImpl;

/**
 * The implementation of the lich su thu phat chi local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * <code>com.mb.service.LichSuThuPhatChiLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security
 * checks based on the propagated JAAS credentials because this service can only
 * be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LichSuThuPhatChiLocalServiceBaseImpl
 */
public class LichSuThuPhatChiLocalServiceImpl extends LichSuThuPhatChiLocalServiceBaseImpl {
	public LichSuThuPhatChi addOrUpdateLichSuThuPhatChi(LichSuThuPhatChi lichSuThuPhatChi,
			ServiceContext serviceContext) throws SystemException, NoSuchUserException {
		if (lichSuThuPhatChi.getLichSuThuPhatChiId() > 0) {
			return updateLichSuThuPhatChi(lichSuThuPhatChi, serviceContext);
		} else {
			return addLichSuThuPhatChi(lichSuThuPhatChi, serviceContext);
		}
	}

	public LichSuThuPhatChi addLichSuThuPhatChi(LichSuThuPhatChi lichSuThuPhatChi, ServiceContext serviceContext)
			throws SystemException, NoSuchUserException {
		Date now = new Date();
		User user = userPersistence.findByPrimaryKey(serviceContext.getUserId());
		long lichSuThuPhatChiId = counterLocalService.increment(LichSuThuPhatChi.class.getName());
		lichSuThuPhatChi.setLichSuThuPhatChiId(lichSuThuPhatChiId);
		lichSuThuPhatChi.setGroupId(serviceContext.getScopeGroupId());
		lichSuThuPhatChi.setCompanyId(user.getCompanyId());
		lichSuThuPhatChi.setUserId(user.getUserId());
		lichSuThuPhatChi.setUserName(user.getFullName());
		if (lichSuThuPhatChi.getCreateDate() == null) {
			lichSuThuPhatChi.setCreateDate(serviceContext.getCreateDate(now));
		}
		lichSuThuPhatChi.setModifiedDate(serviceContext.getModifiedDate(now));
		lichSuThuPhatChi.setExpandoBridgeAttributes(serviceContext);
		addLichSuThuPhatChi(lichSuThuPhatChi);
		return lichSuThuPhatChi;
	}

	public LichSuThuPhatChi updateLichSuThuPhatChi(LichSuThuPhatChi lichSuThuPhatChi, ServiceContext serviceContext)
			throws SystemException {
		lichSuThuPhatChi.setExpandoBridgeAttributes(serviceContext);
		updateLichSuThuPhatChi(lichSuThuPhatChi);
		return lichSuThuPhatChi;
	}

	public void removeByPhatVayId_Loai(long phatVayId, int loai) throws SystemException {
		lichSuThuPhatChiPersistence.removeByPhatVayId_Loai(phatVayId, loai);
	}

	public List<LichSuThuPhatChi> findByPhatVayId_Loai(long phatVayId, int loai) throws SystemException {
		return lichSuThuPhatChiPersistence.findByPhatVayId_Loai(phatVayId, loai);
	}

	public List<LichSuThuPhatChi> findByCTV_Loai_Createdate(String maCTV, int loai, Date ngayTaoTu, Date ngayTaoDen,
			int start, int end, OrderByComparator obc) throws SystemException {
		return lichSuThuPhatChiFinder.findByCTV_Loai_Createdate(maCTV, loai, ngayTaoTu, ngayTaoDen, start, end, obc);
	}

	public List<LichSuThuPhatChi> findByPhatVay_Createdate_Loai(long phatVayId, Date ngayTaoTu, Date ngayTaoDen,
			String loai) throws SystemException {
		return lichSuThuPhatChiFinder.findByPhatVay_Createdate_Loai(phatVayId, ngayTaoTu, ngayTaoDen, loai);
	}

	public void removeByPhatVayId(long phatVayId) throws SystemException {
		lichSuThuPhatChiPersistence.removeByPhatVayId(phatVayId);
	}

}