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
 * The base model interface for the LaiSuat service. Represents a row in the &quot;dm_laisuat&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.mb.model.impl.LaiSuatModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.mb.model.impl.LaiSuatImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LaiSuat
 * @generated
 */
@ProviderType
public interface LaiSuatModel
	extends BaseModel<LaiSuat>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a lai suat model instance should use the {@link LaiSuat} interface instead.
	 */

	/**
	 * Returns the primary key of this lai suat.
	 *
	 * @return the primary key of this lai suat
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this lai suat.
	 *
	 * @param primaryKey the primary key of this lai suat
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the lai suat ID of this lai suat.
	 *
	 * @return the lai suat ID of this lai suat
	 */
	public long getLaiSuatId();

	/**
	 * Sets the lai suat ID of this lai suat.
	 *
	 * @param laiSuatId the lai suat ID of this lai suat
	 */
	public void setLaiSuatId(long laiSuatId);

	/**
	 * Returns the company ID of this lai suat.
	 *
	 * @return the company ID of this lai suat
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this lai suat.
	 *
	 * @param companyId the company ID of this lai suat
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this lai suat.
	 *
	 * @return the group ID of this lai suat
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this lai suat.
	 *
	 * @param groupId the group ID of this lai suat
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this lai suat.
	 *
	 * @return the user ID of this lai suat
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this lai suat.
	 *
	 * @param userId the user ID of this lai suat
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this lai suat.
	 *
	 * @return the user uuid of this lai suat
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this lai suat.
	 *
	 * @param userUuid the user uuid of this lai suat
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this lai suat.
	 *
	 * @return the user name of this lai suat
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this lai suat.
	 *
	 * @param userName the user name of this lai suat
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this lai suat.
	 *
	 * @return the create date of this lai suat
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this lai suat.
	 *
	 * @param createDate the create date of this lai suat
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this lai suat.
	 *
	 * @return the modified date of this lai suat
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this lai suat.
	 *
	 * @param modifiedDate the modified date of this lai suat
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the so tien vay of this lai suat.
	 *
	 * @return the so tien vay of this lai suat
	 */
	public Double getSoTienVay();

	/**
	 * Sets the so tien vay of this lai suat.
	 *
	 * @param soTienVay the so tien vay of this lai suat
	 */
	public void setSoTienVay(Double soTienVay);

	/**
	 * Returns the thoi han of this lai suat.
	 *
	 * @return the thoi han of this lai suat
	 */
	public int getThoiHan();

	/**
	 * Sets the thoi han of this lai suat.
	 *
	 * @param thoiHan the thoi han of this lai suat
	 */
	public void setThoiHan(int thoiHan);

	/**
	 * Returns the lai suat vay of this lai suat.
	 *
	 * @return the lai suat vay of this lai suat
	 */
	public Double getLaiSuatVay();

	/**
	 * Sets the lai suat vay of this lai suat.
	 *
	 * @param laiSuatVay the lai suat vay of this lai suat
	 */
	public void setLaiSuatVay(Double laiSuatVay);

	/**
	 * Returns the goc ngay of this lai suat.
	 *
	 * @return the goc ngay of this lai suat
	 */
	public Double getGocNgay();

	/**
	 * Sets the goc ngay of this lai suat.
	 *
	 * @param gocNgay the goc ngay of this lai suat
	 */
	public void setGocNgay(Double gocNgay);

	/**
	 * Returns the lai ngay of this lai suat.
	 *
	 * @return the lai ngay of this lai suat
	 */
	public Double getLaiNgay();

	/**
	 * Sets the lai ngay of this lai suat.
	 *
	 * @param laiNgay the lai ngay of this lai suat
	 */
	public void setLaiNgay(Double laiNgay);

	/**
	 * Returns the goc ngay cuoi of this lai suat.
	 *
	 * @return the goc ngay cuoi of this lai suat
	 */
	public Double getGocNgayCuoi();

	/**
	 * Sets the goc ngay cuoi of this lai suat.
	 *
	 * @param gocNgayCuoi the goc ngay cuoi of this lai suat
	 */
	public void setGocNgayCuoi(Double gocNgayCuoi);

	/**
	 * Returns the hoat dong of this lai suat.
	 *
	 * @return the hoat dong of this lai suat
	 */
	public Boolean getHoatDong();

	/**
	 * Sets the hoat dong of this lai suat.
	 *
	 * @param hoatDong the hoat dong of this lai suat
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
	public int compareTo(LaiSuat laiSuat);

	@Override
	public int hashCode();

	@Override
	public CacheModel<LaiSuat> toCacheModel();

	@Override
	public LaiSuat toEscapedModel();

	@Override
	public LaiSuat toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}