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
 * The base model interface for the TaiSanThueChap service. Represents a row in the &quot;mb_taisaithuechap&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.mb.model.impl.TaiSanThueChapModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.mb.model.impl.TaiSanThueChapImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TaiSanThueChap
 * @generated
 */
@ProviderType
public interface TaiSanThueChapModel
	extends BaseModel<TaiSanThueChap>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tai san thue chap model instance should use the {@link TaiSanThueChap} interface instead.
	 */

	/**
	 * Returns the primary key of this tai san thue chap.
	 *
	 * @return the primary key of this tai san thue chap
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tai san thue chap.
	 *
	 * @param primaryKey the primary key of this tai san thue chap
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tai san thue chap ID of this tai san thue chap.
	 *
	 * @return the tai san thue chap ID of this tai san thue chap
	 */
	public long getTaiSanThueChapId();

	/**
	 * Sets the tai san thue chap ID of this tai san thue chap.
	 *
	 * @param taiSanThueChapId the tai san thue chap ID of this tai san thue chap
	 */
	public void setTaiSanThueChapId(long taiSanThueChapId);

	/**
	 * Returns the company ID of this tai san thue chap.
	 *
	 * @return the company ID of this tai san thue chap
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tai san thue chap.
	 *
	 * @param companyId the company ID of this tai san thue chap
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this tai san thue chap.
	 *
	 * @return the group ID of this tai san thue chap
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tai san thue chap.
	 *
	 * @param groupId the group ID of this tai san thue chap
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this tai san thue chap.
	 *
	 * @return the user ID of this tai san thue chap
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tai san thue chap.
	 *
	 * @param userId the user ID of this tai san thue chap
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tai san thue chap.
	 *
	 * @return the user uuid of this tai san thue chap
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tai san thue chap.
	 *
	 * @param userUuid the user uuid of this tai san thue chap
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tai san thue chap.
	 *
	 * @return the user name of this tai san thue chap
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tai san thue chap.
	 *
	 * @param userName the user name of this tai san thue chap
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tai san thue chap.
	 *
	 * @return the create date of this tai san thue chap
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tai san thue chap.
	 *
	 * @param createDate the create date of this tai san thue chap
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tai san thue chap.
	 *
	 * @return the modified date of this tai san thue chap
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tai san thue chap.
	 *
	 * @param modifiedDate the modified date of this tai san thue chap
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the phat vay ID of this tai san thue chap.
	 *
	 * @return the phat vay ID of this tai san thue chap
	 */
	public long getPhatVayId();

	/**
	 * Sets the phat vay ID of this tai san thue chap.
	 *
	 * @param phatVayId the phat vay ID of this tai san thue chap
	 */
	public void setPhatVayId(long phatVayId);

	/**
	 * Returns the so ku of this tai san thue chap.
	 *
	 * @return the so ku of this tai san thue chap
	 */
	@AutoEscape
	public String getSoKU();

	/**
	 * Sets the so ku of this tai san thue chap.
	 *
	 * @param soKU the so ku of this tai san thue chap
	 */
	public void setSoKU(String soKU);

	/**
	 * Returns the ma khach hang of this tai san thue chap.
	 *
	 * @return the ma khach hang of this tai san thue chap
	 */
	@AutoEscape
	public String getMaKhachHang();

	/**
	 * Sets the ma khach hang of this tai san thue chap.
	 *
	 * @param maKhachHang the ma khach hang of this tai san thue chap
	 */
	public void setMaKhachHang(String maKhachHang);

	/**
	 * Returns the loai tai san ID of this tai san thue chap.
	 *
	 * @return the loai tai san ID of this tai san thue chap
	 */
	public long getLoaiTaiSanId();

	/**
	 * Sets the loai tai san ID of this tai san thue chap.
	 *
	 * @param loaiTaiSanId the loai tai san ID of this tai san thue chap
	 */
	public void setLoaiTaiSanId(long loaiTaiSanId);

	/**
	 * Returns the gia tri tai san of this tai san thue chap.
	 *
	 * @return the gia tri tai san of this tai san thue chap
	 */
	public Double getGiaTriTaiSan();

	/**
	 * Sets the gia tri tai san of this tai san thue chap.
	 *
	 * @param giaTriTaiSan the gia tri tai san of this tai san thue chap
	 */
	public void setGiaTriTaiSan(Double giaTriTaiSan);

	/**
	 * Returns the thong tin tai san of this tai san thue chap.
	 *
	 * @return the thong tin tai san of this tai san thue chap
	 */
	@AutoEscape
	public String getThongTinTaiSan();

	/**
	 * Sets the thong tin tai san of this tai san thue chap.
	 *
	 * @param thongTinTaiSan the thong tin tai san of this tai san thue chap
	 */
	public void setThongTinTaiSan(String thongTinTaiSan);

	/**
	 * Returns the ten of this tai san thue chap.
	 *
	 * @return the ten of this tai san thue chap
	 */
	@AutoEscape
	public String getTen();

	/**
	 * Sets the ten of this tai san thue chap.
	 *
	 * @param ten the ten of this tai san thue chap
	 */
	public void setTen(String ten);

	/**
	 * Returns the ghi chu of this tai san thue chap.
	 *
	 * @return the ghi chu of this tai san thue chap
	 */
	@AutoEscape
	public String getGhiChu();

	/**
	 * Sets the ghi chu of this tai san thue chap.
	 *
	 * @param ghiChu the ghi chu of this tai san thue chap
	 */
	public void setGhiChu(String ghiChu);

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
	public int compareTo(TaiSanThueChap taiSanThueChap);

	@Override
	public int hashCode();

	@Override
	public CacheModel<TaiSanThueChap> toCacheModel();

	@Override
	public TaiSanThueChap toEscapedModel();

	@Override
	public TaiSanThueChap toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}