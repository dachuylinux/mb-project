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
 * The base model interface for the PhatVay service. Represents a row in the &quot;mb_phatvay&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.mb.model.impl.PhatVayModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.mb.model.impl.PhatVayImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PhatVay
 * @generated
 */
@ProviderType
public interface PhatVayModel
	extends BaseModel<PhatVay>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a phat vay model instance should use the {@link PhatVay} interface instead.
	 */

	/**
	 * Returns the primary key of this phat vay.
	 *
	 * @return the primary key of this phat vay
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this phat vay.
	 *
	 * @param primaryKey the primary key of this phat vay
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the phat vay ID of this phat vay.
	 *
	 * @return the phat vay ID of this phat vay
	 */
	public long getPhatVayId();

	/**
	 * Sets the phat vay ID of this phat vay.
	 *
	 * @param phatVayId the phat vay ID of this phat vay
	 */
	public void setPhatVayId(long phatVayId);

	/**
	 * Returns the company ID of this phat vay.
	 *
	 * @return the company ID of this phat vay
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this phat vay.
	 *
	 * @param companyId the company ID of this phat vay
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this phat vay.
	 *
	 * @return the group ID of this phat vay
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this phat vay.
	 *
	 * @param groupId the group ID of this phat vay
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this phat vay.
	 *
	 * @return the user ID of this phat vay
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this phat vay.
	 *
	 * @param userId the user ID of this phat vay
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this phat vay.
	 *
	 * @return the user uuid of this phat vay
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this phat vay.
	 *
	 * @param userUuid the user uuid of this phat vay
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this phat vay.
	 *
	 * @return the user name of this phat vay
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this phat vay.
	 *
	 * @param userName the user name of this phat vay
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the ngay tao of this phat vay.
	 *
	 * @return the ngay tao of this phat vay
	 */
	public Date getNgayTao();

	/**
	 * Sets the ngay tao of this phat vay.
	 *
	 * @param ngayTao the ngay tao of this phat vay
	 */
	public void setNgayTao(Date ngayTao);

	/**
	 * Returns the modified date of this phat vay.
	 *
	 * @return the modified date of this phat vay
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this phat vay.
	 *
	 * @param modifiedDate the modified date of this phat vay
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ma ctv of this phat vay.
	 *
	 * @return the ma ctv of this phat vay
	 */
	@AutoEscape
	public String getMaCTV();

	/**
	 * Sets the ma ctv of this phat vay.
	 *
	 * @param maCTV the ma ctv of this phat vay
	 */
	public void setMaCTV(String maCTV);

	/**
	 * Returns the ma khach hang of this phat vay.
	 *
	 * @return the ma khach hang of this phat vay
	 */
	@AutoEscape
	public String getMaKhachHang();

	/**
	 * Sets the ma khach hang of this phat vay.
	 *
	 * @param maKhachHang the ma khach hang of this phat vay
	 */
	public void setMaKhachHang(String maKhachHang);

	/**
	 * Returns the so ku of this phat vay.
	 *
	 * @return the so ku of this phat vay
	 */
	@AutoEscape
	public String getSoKU();

	/**
	 * Sets the so ku of this phat vay.
	 *
	 * @param soKU the so ku of this phat vay
	 */
	public void setSoKU(String soKU);

	/**
	 * Returns the create date of this phat vay.
	 *
	 * @return the create date of this phat vay
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this phat vay.
	 *
	 * @param createDate the create date of this phat vay
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the ngay bat dau of this phat vay.
	 *
	 * @return the ngay bat dau of this phat vay
	 */
	public Date getNgayBatDau();

	/**
	 * Sets the ngay bat dau of this phat vay.
	 *
	 * @param ngayBatDau the ngay bat dau of this phat vay
	 */
	public void setNgayBatDau(Date ngayBatDau);

	/**
	 * Returns the ngay ket thuc of this phat vay.
	 *
	 * @return the ngay ket thuc of this phat vay
	 */
	public Date getNgayKetThuc();

	/**
	 * Sets the ngay ket thuc of this phat vay.
	 *
	 * @param ngayKetThuc the ngay ket thuc of this phat vay
	 */
	public void setNgayKetThuc(Date ngayKetThuc);

	/**
	 * Returns the loai phat vay of this phat vay.
	 *
	 * @return the loai phat vay of this phat vay
	 */
	public int getLoaiPhatVay();

	/**
	 * Sets the loai phat vay of this phat vay.
	 *
	 * @param loaiPhatVay the loai phat vay of this phat vay
	 */
	public void setLoaiPhatVay(int loaiPhatVay);

	/**
	 * Returns the so lan da thu of this phat vay.
	 *
	 * @return the so lan da thu of this phat vay
	 */
	public int getSoLanDaThu();

	/**
	 * Sets the so lan da thu of this phat vay.
	 *
	 * @param soLanDaThu the so lan da thu of this phat vay
	 */
	public void setSoLanDaThu(int soLanDaThu);

	/**
	 * Returns the ngay da thu cuoi of this phat vay.
	 *
	 * @return the ngay da thu cuoi of this phat vay
	 */
	public Date getNgayDaThuCuoi();

	/**
	 * Sets the ngay da thu cuoi of this phat vay.
	 *
	 * @param ngayDaThuCuoi the ngay da thu cuoi of this phat vay
	 */
	public void setNgayDaThuCuoi(Date ngayDaThuCuoi);

	/**
	 * Returns the so tien vay of this phat vay.
	 *
	 * @return the so tien vay of this phat vay
	 */
	public Double getSoTienVay();

	/**
	 * Sets the so tien vay of this phat vay.
	 *
	 * @param soTienVay the so tien vay of this phat vay
	 */
	public void setSoTienVay(Double soTienVay);

	/**
	 * Returns the thoi han of this phat vay.
	 *
	 * @return the thoi han of this phat vay
	 */
	public int getThoiHan();

	/**
	 * Sets the thoi han of this phat vay.
	 *
	 * @param thoiHan the thoi han of this phat vay
	 */
	public void setThoiHan(int thoiHan);

	/**
	 * Returns the lai suat vay of this phat vay.
	 *
	 * @return the lai suat vay of this phat vay
	 */
	public Double getLaiSuatVay();

	/**
	 * Sets the lai suat vay of this phat vay.
	 *
	 * @param laiSuatVay the lai suat vay of this phat vay
	 */
	public void setLaiSuatVay(Double laiSuatVay);

	/**
	 * Returns the goc ngay of this phat vay.
	 *
	 * @return the goc ngay of this phat vay
	 */
	public Double getGocNgay();

	/**
	 * Sets the goc ngay of this phat vay.
	 *
	 * @param gocNgay the goc ngay of this phat vay
	 */
	public void setGocNgay(Double gocNgay);

	/**
	 * Returns the lai ngay of this phat vay.
	 *
	 * @return the lai ngay of this phat vay
	 */
	public Double getLaiNgay();

	/**
	 * Sets the lai ngay of this phat vay.
	 *
	 * @param laiNgay the lai ngay of this phat vay
	 */
	public void setLaiNgay(Double laiNgay);

	/**
	 * Returns the goc ngay cuoi of this phat vay.
	 *
	 * @return the goc ngay cuoi of this phat vay
	 */
	public Double getGocNgayCuoi();

	/**
	 * Sets the goc ngay cuoi of this phat vay.
	 *
	 * @param gocNgayCuoi the goc ngay cuoi of this phat vay
	 */
	public void setGocNgayCuoi(Double gocNgayCuoi);

	/**
	 * Returns the so ngay thu truoc of this phat vay.
	 *
	 * @return the so ngay thu truoc of this phat vay
	 */
	public int getSoNgayThuTruoc();

	/**
	 * Sets the so ngay thu truoc of this phat vay.
	 *
	 * @param soNgayThuTruoc the so ngay thu truoc of this phat vay
	 */
	public void setSoNgayThuTruoc(int soNgayThuTruoc);

	/**
	 * Returns the ngay thu truoc tu of this phat vay.
	 *
	 * @return the ngay thu truoc tu of this phat vay
	 */
	public Date getNgayThuTruocTu();

	/**
	 * Sets the ngay thu truoc tu of this phat vay.
	 *
	 * @param ngayThuTruocTu the ngay thu truoc tu of this phat vay
	 */
	public void setNgayThuTruocTu(Date ngayThuTruocTu);

	/**
	 * Returns the ngay thu truoc den of this phat vay.
	 *
	 * @return the ngay thu truoc den of this phat vay
	 */
	public Date getNgayThuTruocDen();

	/**
	 * Sets the ngay thu truoc den of this phat vay.
	 *
	 * @param ngayThuTruocDen the ngay thu truoc den of this phat vay
	 */
	public void setNgayThuTruocDen(Date ngayThuTruocDen);

	/**
	 * Returns the ngay tat toan of this phat vay.
	 *
	 * @return the ngay tat toan of this phat vay
	 */
	public Date getNgayTatToan();

	/**
	 * Sets the ngay tat toan of this phat vay.
	 *
	 * @param ngayTatToan the ngay tat toan of this phat vay
	 */
	public void setNgayTatToan(Date ngayTatToan);

	/**
	 * Returns the trang thai of this phat vay.
	 *
	 * @return the trang thai of this phat vay
	 */
	public int getTrangThai();

	/**
	 * Sets the trang thai of this phat vay.
	 *
	 * @param trangThai the trang thai of this phat vay
	 */
	public void setTrangThai(int trangThai);

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
	public int compareTo(PhatVay phatVay);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PhatVay> toCacheModel();

	@Override
	public PhatVay toEscapedModel();

	@Override
	public PhatVay toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}