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

package com.mb.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MaSoThuChi service. Represents a row in the &quot;dm_masothuchi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.mb.model.impl.MaSoThuChiModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.mb.model.impl.MaSoThuChiImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MaSoThuChi
 * @generated
 */
@ProviderType
public interface MaSoThuChiModel
	extends BaseModel<MaSoThuChi>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ma so thu chi model instance should use the {@link MaSoThuChi} interface instead.
	 */

	/**
	 * Returns the primary key of this ma so thu chi.
	 *
	 * @return the primary key of this ma so thu chi
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ma so thu chi.
	 *
	 * @param primaryKey the primary key of this ma so thu chi
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ma so thu chi ID of this ma so thu chi.
	 *
	 * @return the ma so thu chi ID of this ma so thu chi
	 */
	public long getMaSoThuChiId();

	/**
	 * Sets the ma so thu chi ID of this ma so thu chi.
	 *
	 * @param maSoThuChiId the ma so thu chi ID of this ma so thu chi
	 */
	public void setMaSoThuChiId(long maSoThuChiId);

	/**
	 * Returns the company ID of this ma so thu chi.
	 *
	 * @return the company ID of this ma so thu chi
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ma so thu chi.
	 *
	 * @param companyId the company ID of this ma so thu chi
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this ma so thu chi.
	 *
	 * @return the group ID of this ma so thu chi
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ma so thu chi.
	 *
	 * @param groupId the group ID of this ma so thu chi
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this ma so thu chi.
	 *
	 * @return the user ID of this ma so thu chi
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ma so thu chi.
	 *
	 * @param userId the user ID of this ma so thu chi
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ma so thu chi.
	 *
	 * @return the user uuid of this ma so thu chi
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ma so thu chi.
	 *
	 * @param userUuid the user uuid of this ma so thu chi
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ma so thu chi.
	 *
	 * @return the user name of this ma so thu chi
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ma so thu chi.
	 *
	 * @param userName the user name of this ma so thu chi
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ma so thu chi.
	 *
	 * @return the create date of this ma so thu chi
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ma so thu chi.
	 *
	 * @param createDate the create date of this ma so thu chi
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ma so thu chi.
	 *
	 * @return the modified date of this ma so thu chi
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ma so thu chi.
	 *
	 * @param modifiedDate the modified date of this ma so thu chi
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ma of this ma so thu chi.
	 *
	 * @return the ma of this ma so thu chi
	 */
	@AutoEscape
	public String getMa();

	/**
	 * Sets the ma of this ma so thu chi.
	 *
	 * @param ma the ma of this ma so thu chi
	 */
	public void setMa(String ma);

	/**
	 * Returns the dien giai of this ma so thu chi.
	 *
	 * @return the dien giai of this ma so thu chi
	 */
	@AutoEscape
	public String getDienGiai();

	/**
	 * Sets the dien giai of this ma so thu chi.
	 *
	 * @param dienGiai the dien giai of this ma so thu chi
	 */
	public void setDienGiai(String dienGiai);

	/**
	 * Returns the dien giai theo doi of this ma so thu chi.
	 *
	 * @return the dien giai theo doi of this ma so thu chi
	 */
	@AutoEscape
	public String getDienGiaiTheoDoi();

	/**
	 * Sets the dien giai theo doi of this ma so thu chi.
	 *
	 * @param dienGiaiTheoDoi the dien giai theo doi of this ma so thu chi
	 */
	public void setDienGiaiTheoDoi(String dienGiaiTheoDoi);

	/**
	 * Returns the loai of this ma so thu chi.
	 *
	 * @return the loai of this ma so thu chi
	 */
	public int getLoai();

	/**
	 * Sets the loai of this ma so thu chi.
	 *
	 * @param loai the loai of this ma so thu chi
	 */
	public void setLoai(int loai);

	/**
	 * Returns the hoat dong of this ma so thu chi.
	 *
	 * @return the hoat dong of this ma so thu chi
	 */
	public Boolean getHoatDong();

	/**
	 * Sets the hoat dong of this ma so thu chi.
	 *
	 * @param hoatDong the hoat dong of this ma so thu chi
	 */
	public void setHoatDong(Boolean hoatDong);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(MaSoThuChi maSoThuChi);

	@Override
	public int hashCode();

	@Override
	public CacheModel<MaSoThuChi> toCacheModel();

	@Override
	public MaSoThuChi toEscapedModel();

	@Override
	public MaSoThuChi toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}