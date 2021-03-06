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

package com.mb.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.NoSuchUserException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.mb.model.DsPhieuTaiKhoan;
import com.mb.model.Phieu;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

/**
 * Provides the local service interface for DsPhieuTaiKhoan. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see DsPhieuTaiKhoanLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface DsPhieuTaiKhoanLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DsPhieuTaiKhoanLocalServiceUtil} to access the ds phieu tai khoan local service. Add custom service methods to <code>com.mb.service.impl.DsPhieuTaiKhoanLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the ds phieu tai khoan to the database. Also notifies the appropriate model listeners.
	 *
	 * @param dsPhieuTaiKhoan the ds phieu tai khoan
	 * @return the ds phieu tai khoan that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DsPhieuTaiKhoan addDsPhieuTaiKhoan(DsPhieuTaiKhoan dsPhieuTaiKhoan);

	public DsPhieuTaiKhoan addDsPhieuTaiKhoan(
			DsPhieuTaiKhoan dsPhieuTaiKhoan, ServiceContext serviceContext)
		throws NoSuchUserException, SystemException;

	public void addOrUpdateDsPhieuTaiKhoan(
			Phieu phieu, ServiceContext serviceContext)
		throws NoSuchUserException, SystemException;

	/**
	 * Creates a new ds phieu tai khoan with the primary key. Does not add the ds phieu tai khoan to the database.
	 *
	 * @param dsPhieuTaiKhoanId the primary key for the new ds phieu tai khoan
	 * @return the new ds phieu tai khoan
	 */
	@Transactional(enabled = false)
	public DsPhieuTaiKhoan createDsPhieuTaiKhoan(long dsPhieuTaiKhoanId);

	/**
	 * Deletes the ds phieu tai khoan from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dsPhieuTaiKhoan the ds phieu tai khoan
	 * @return the ds phieu tai khoan that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public DsPhieuTaiKhoan deleteDsPhieuTaiKhoan(
		DsPhieuTaiKhoan dsPhieuTaiKhoan);

	/**
	 * Deletes the ds phieu tai khoan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param dsPhieuTaiKhoanId the primary key of the ds phieu tai khoan
	 * @return the ds phieu tai khoan that was removed
	 * @throws PortalException if a ds phieu tai khoan with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public DsPhieuTaiKhoan deleteDsPhieuTaiKhoan(long dsPhieuTaiKhoanId)
		throws PortalException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.mb.model.impl.DsPhieuTaiKhoanModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.mb.model.impl.DsPhieuTaiKhoanModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DsPhieuTaiKhoan fetchDsPhieuTaiKhoan(long dsPhieuTaiKhoanId);

	public List<DsPhieuTaiKhoan> findByPhieuId(long phieuId)
		throws SystemException;

	public List<DsPhieuTaiKhoan> findByTaiKhoanDoiUngId_HoatDong(
			long taiKhoanDoiUngId, boolean hoatDong)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	/**
	 * Returns the ds phieu tai khoan with the primary key.
	 *
	 * @param dsPhieuTaiKhoanId the primary key of the ds phieu tai khoan
	 * @return the ds phieu tai khoan
	 * @throws PortalException if a ds phieu tai khoan with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DsPhieuTaiKhoan getDsPhieuTaiKhoan(long dsPhieuTaiKhoanId)
		throws PortalException;

	/**
	 * Returns a range of all the ds phieu tai khoans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code>), then the query will include the default ORDER BY logic from <code>com.mb.model.impl.DsPhieuTaiKhoanModelImpl</code>. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of ds phieu tai khoans
	 * @param end the upper bound of the range of ds phieu tai khoans (not inclusive)
	 * @return the range of ds phieu tai khoans
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DsPhieuTaiKhoan> getDsPhieuTaiKhoans(int start, int end);

	/**
	 * Returns the number of ds phieu tai khoans.
	 *
	 * @return the number of ds phieu tai khoans
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getDsPhieuTaiKhoansCount();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<DsPhieuTaiKhoan> getDSThuChiByTaiKhoanNgayChungTu(
			long taiKhoanDoiUngId, String maCTV, Date ngayChungTuTu,
			Date ngayChungTuDen, int hoatDong, int start, int end,
			OrderByComparator obc)
		throws SystemException;

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	public void removeByPhieuId(long phieuId) throws SystemException;

	/**
	 * Updates the ds phieu tai khoan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param dsPhieuTaiKhoan the ds phieu tai khoan
	 * @return the ds phieu tai khoan that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public DsPhieuTaiKhoan updateDsPhieuTaiKhoan(
		DsPhieuTaiKhoan dsPhieuTaiKhoan);

	public DsPhieuTaiKhoan updateDsPhieuTaiKhoan(
			DsPhieuTaiKhoan dsPhieuTaiKhoan, ServiceContext serviceContext)
		throws SystemException;

}