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

package com.mb.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.mb.model.CongTacVien;
import com.mb.model.CongTacVienModel;
import com.mb.model.CongTacVienSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the CongTacVien service. Represents a row in the &quot;dm_congtacvien&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>CongTacVienModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CongTacVienImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CongTacVienImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class CongTacVienModelImpl
	extends BaseModelImpl<CongTacVien> implements CongTacVienModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a cong tac vien model instance should use the <code>CongTacVien</code> interface instead.
	 */
	public static final String TABLE_NAME = "dm_congtacvien";

	public static final Object[][] TABLE_COLUMNS = {
		{"congTacVienId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"ma", Types.VARCHAR},
		{"hoTen", Types.VARCHAR}, {"soCMND", Types.VARCHAR},
		{"duNoToiDa", Types.DOUBLE}, {"duNoToiDaTheChap", Types.DOUBLE},
		{"diaChi", Types.VARCHAR}, {"ghiChu", Types.VARCHAR},
		{"hoatDong", Types.BOOLEAN}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("congTacVienId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("ma", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hoTen", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("soCMND", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("duNoToiDa", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("duNoToiDaTheChap", Types.DOUBLE);
		TABLE_COLUMNS_MAP.put("diaChi", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("ghiChu", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("hoatDong", Types.BOOLEAN);
	}

	public static final String TABLE_SQL_CREATE =
		"create table dm_congtacvien (congTacVienId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,ma VARCHAR(75) null,hoTen VARCHAR(75) null,soCMND VARCHAR(75) null,duNoToiDa DOUBLE,duNoToiDaTheChap DOUBLE,diaChi VARCHAR(75) null,ghiChu VARCHAR(75) null,hoatDong BOOLEAN)";

	public static final String TABLE_SQL_DROP = "drop table dm_congtacvien";

	public static final String ORDER_BY_JPQL =
		" ORDER BY congTacVien.congTacVienId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY dm_congtacvien.congTacVienId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.mb.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.mb.model.CongTacVien"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.mb.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.mb.model.CongTacVien"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.mb.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.mb.model.CongTacVien"),
		true);

	public static final long MA_COLUMN_BITMASK = 1L;

	public static final long SOCMND_COLUMN_BITMASK = 2L;

	public static final long CONGTACVIENID_COLUMN_BITMASK = 4L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CongTacVien toModel(CongTacVienSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CongTacVien model = new CongTacVienImpl();

		model.setCongTacVienId(soapModel.getCongTacVienId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setMa(soapModel.getMa());
		model.setHoTen(soapModel.getHoTen());
		model.setSoCMND(soapModel.getSoCMND());
		model.setDuNoToiDa(soapModel.getDuNoToiDa());
		model.setDuNoToiDaTheChap(soapModel.getDuNoToiDaTheChap());
		model.setDiaChi(soapModel.getDiaChi());
		model.setGhiChu(soapModel.getGhiChu());
		model.setHoatDong(soapModel.getHoatDong());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<CongTacVien> toModels(CongTacVienSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CongTacVien> models = new ArrayList<CongTacVien>(
			soapModels.length);

		for (CongTacVienSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.mb.service.util.ServiceProps.get(
			"lock.expiration.time.com.mb.model.CongTacVien"));

	public CongTacVienModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _congTacVienId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCongTacVienId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _congTacVienId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CongTacVien.class;
	}

	@Override
	public String getModelClassName() {
		return CongTacVien.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<CongTacVien, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<CongTacVien, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CongTacVien, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((CongTacVien)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<CongTacVien, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<CongTacVien, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(CongTacVien)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<CongTacVien, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<CongTacVien, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<CongTacVien, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<CongTacVien, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<CongTacVien, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<CongTacVien, Object>>();
		Map<String, BiConsumer<CongTacVien, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<CongTacVien, ?>>();

		attributeGetterFunctions.put(
			"congTacVienId",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getCongTacVienId();
				}

			});
		attributeSetterBiConsumers.put(
			"congTacVienId",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(
					CongTacVien congTacVien, Object congTacVienId) {

					congTacVien.setCongTacVienId((Long)congTacVienId);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object companyId) {
					congTacVien.setCompanyId((Long)companyId);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object groupId) {
					congTacVien.setGroupId((Long)groupId);
				}

			});
		attributeGetterFunctions.put(
			"userId",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getUserId();
				}

			});
		attributeSetterBiConsumers.put(
			"userId",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object userId) {
					congTacVien.setUserId((Long)userId);
				}

			});
		attributeGetterFunctions.put(
			"userName",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getUserName();
				}

			});
		attributeSetterBiConsumers.put(
			"userName",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object userName) {
					congTacVien.setUserName((String)userName);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object createDate) {
					congTacVien.setCreateDate((Date)createDate);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(
					CongTacVien congTacVien, Object modifiedDate) {

					congTacVien.setModifiedDate((Date)modifiedDate);
				}

			});
		attributeGetterFunctions.put(
			"ma",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getMa();
				}

			});
		attributeSetterBiConsumers.put(
			"ma",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object ma) {
					congTacVien.setMa((String)ma);
				}

			});
		attributeGetterFunctions.put(
			"hoTen",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getHoTen();
				}

			});
		attributeSetterBiConsumers.put(
			"hoTen",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object hoTen) {
					congTacVien.setHoTen((String)hoTen);
				}

			});
		attributeGetterFunctions.put(
			"soCMND",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getSoCMND();
				}

			});
		attributeSetterBiConsumers.put(
			"soCMND",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object soCMND) {
					congTacVien.setSoCMND((String)soCMND);
				}

			});
		attributeGetterFunctions.put(
			"duNoToiDa",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getDuNoToiDa();
				}

			});
		attributeSetterBiConsumers.put(
			"duNoToiDa",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object duNoToiDa) {
					congTacVien.setDuNoToiDa((Double)duNoToiDa);
				}

			});
		attributeGetterFunctions.put(
			"duNoToiDaTheChap",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getDuNoToiDaTheChap();
				}

			});
		attributeSetterBiConsumers.put(
			"duNoToiDaTheChap",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(
					CongTacVien congTacVien, Object duNoToiDaTheChap) {

					congTacVien.setDuNoToiDaTheChap((Double)duNoToiDaTheChap);
				}

			});
		attributeGetterFunctions.put(
			"diaChi",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getDiaChi();
				}

			});
		attributeSetterBiConsumers.put(
			"diaChi",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object diaChi) {
					congTacVien.setDiaChi((String)diaChi);
				}

			});
		attributeGetterFunctions.put(
			"ghiChu",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getGhiChu();
				}

			});
		attributeSetterBiConsumers.put(
			"ghiChu",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object ghiChu) {
					congTacVien.setGhiChu((String)ghiChu);
				}

			});
		attributeGetterFunctions.put(
			"hoatDong",
			new Function<CongTacVien, Object>() {

				@Override
				public Object apply(CongTacVien congTacVien) {
					return congTacVien.getHoatDong();
				}

			});
		attributeSetterBiConsumers.put(
			"hoatDong",
			new BiConsumer<CongTacVien, Object>() {

				@Override
				public void accept(CongTacVien congTacVien, Object hoatDong) {
					congTacVien.setHoatDong((Boolean)hoatDong);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getCongTacVienId() {
		return _congTacVienId;
	}

	@Override
	public void setCongTacVienId(long congTacVienId) {
		_columnBitmask = -1L;

		_congTacVienId = congTacVienId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException pe) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getMa() {
		if (_ma == null) {
			return "";
		}
		else {
			return _ma;
		}
	}

	@Override
	public void setMa(String ma) {
		_columnBitmask |= MA_COLUMN_BITMASK;

		if (_originalMa == null) {
			_originalMa = _ma;
		}

		_ma = ma;
	}

	public String getOriginalMa() {
		return GetterUtil.getString(_originalMa);
	}

	@JSON
	@Override
	public String getHoTen() {
		if (_hoTen == null) {
			return "";
		}
		else {
			return _hoTen;
		}
	}

	@Override
	public void setHoTen(String hoTen) {
		_hoTen = hoTen;
	}

	@JSON
	@Override
	public String getSoCMND() {
		if (_soCMND == null) {
			return "";
		}
		else {
			return _soCMND;
		}
	}

	@Override
	public void setSoCMND(String soCMND) {
		_columnBitmask |= SOCMND_COLUMN_BITMASK;

		if (_originalSoCMND == null) {
			_originalSoCMND = _soCMND;
		}

		_soCMND = soCMND;
	}

	public String getOriginalSoCMND() {
		return GetterUtil.getString(_originalSoCMND);
	}

	@JSON
	@Override
	public Double getDuNoToiDa() {
		return _duNoToiDa;
	}

	@Override
	public void setDuNoToiDa(Double duNoToiDa) {
		_duNoToiDa = duNoToiDa;
	}

	@JSON
	@Override
	public Double getDuNoToiDaTheChap() {
		return _duNoToiDaTheChap;
	}

	@Override
	public void setDuNoToiDaTheChap(Double duNoToiDaTheChap) {
		_duNoToiDaTheChap = duNoToiDaTheChap;
	}

	@JSON
	@Override
	public String getDiaChi() {
		if (_diaChi == null) {
			return "";
		}
		else {
			return _diaChi;
		}
	}

	@Override
	public void setDiaChi(String diaChi) {
		_diaChi = diaChi;
	}

	@JSON
	@Override
	public String getGhiChu() {
		if (_ghiChu == null) {
			return "";
		}
		else {
			return _ghiChu;
		}
	}

	@Override
	public void setGhiChu(String ghiChu) {
		_ghiChu = ghiChu;
	}

	@JSON
	@Override
	public Boolean getHoatDong() {
		return _hoatDong;
	}

	@Override
	public void setHoatDong(Boolean hoatDong) {
		_hoatDong = hoatDong;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), CongTacVien.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CongTacVien toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CongTacVien)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CongTacVienImpl congTacVienImpl = new CongTacVienImpl();

		congTacVienImpl.setCongTacVienId(getCongTacVienId());
		congTacVienImpl.setCompanyId(getCompanyId());
		congTacVienImpl.setGroupId(getGroupId());
		congTacVienImpl.setUserId(getUserId());
		congTacVienImpl.setUserName(getUserName());
		congTacVienImpl.setCreateDate(getCreateDate());
		congTacVienImpl.setModifiedDate(getModifiedDate());
		congTacVienImpl.setMa(getMa());
		congTacVienImpl.setHoTen(getHoTen());
		congTacVienImpl.setSoCMND(getSoCMND());
		congTacVienImpl.setDuNoToiDa(getDuNoToiDa());
		congTacVienImpl.setDuNoToiDaTheChap(getDuNoToiDaTheChap());
		congTacVienImpl.setDiaChi(getDiaChi());
		congTacVienImpl.setGhiChu(getGhiChu());
		congTacVienImpl.setHoatDong(getHoatDong());

		congTacVienImpl.resetOriginalValues();

		return congTacVienImpl;
	}

	@Override
	public int compareTo(CongTacVien congTacVien) {
		int value = 0;

		if (getCongTacVienId() < congTacVien.getCongTacVienId()) {
			value = -1;
		}
		else if (getCongTacVienId() > congTacVien.getCongTacVienId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CongTacVien)) {
			return false;
		}

		CongTacVien congTacVien = (CongTacVien)obj;

		long primaryKey = congTacVien.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		CongTacVienModelImpl congTacVienModelImpl = this;

		congTacVienModelImpl._setModifiedDate = false;

		congTacVienModelImpl._originalMa = congTacVienModelImpl._ma;

		congTacVienModelImpl._originalSoCMND = congTacVienModelImpl._soCMND;

		congTacVienModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CongTacVien> toCacheModel() {
		CongTacVienCacheModel congTacVienCacheModel =
			new CongTacVienCacheModel();

		congTacVienCacheModel.congTacVienId = getCongTacVienId();

		congTacVienCacheModel.companyId = getCompanyId();

		congTacVienCacheModel.groupId = getGroupId();

		congTacVienCacheModel.userId = getUserId();

		congTacVienCacheModel.userName = getUserName();

		String userName = congTacVienCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			congTacVienCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			congTacVienCacheModel.createDate = createDate.getTime();
		}
		else {
			congTacVienCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			congTacVienCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			congTacVienCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		congTacVienCacheModel.ma = getMa();

		String ma = congTacVienCacheModel.ma;

		if ((ma != null) && (ma.length() == 0)) {
			congTacVienCacheModel.ma = null;
		}

		congTacVienCacheModel.hoTen = getHoTen();

		String hoTen = congTacVienCacheModel.hoTen;

		if ((hoTen != null) && (hoTen.length() == 0)) {
			congTacVienCacheModel.hoTen = null;
		}

		congTacVienCacheModel.soCMND = getSoCMND();

		String soCMND = congTacVienCacheModel.soCMND;

		if ((soCMND != null) && (soCMND.length() == 0)) {
			congTacVienCacheModel.soCMND = null;
		}

		congTacVienCacheModel.duNoToiDa = getDuNoToiDa();

		congTacVienCacheModel.duNoToiDaTheChap = getDuNoToiDaTheChap();

		congTacVienCacheModel.diaChi = getDiaChi();

		String diaChi = congTacVienCacheModel.diaChi;

		if ((diaChi != null) && (diaChi.length() == 0)) {
			congTacVienCacheModel.diaChi = null;
		}

		congTacVienCacheModel.ghiChu = getGhiChu();

		String ghiChu = congTacVienCacheModel.ghiChu;

		if ((ghiChu != null) && (ghiChu.length() == 0)) {
			congTacVienCacheModel.ghiChu = null;
		}

		congTacVienCacheModel.hoatDong = getHoatDong();

		return congTacVienCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<CongTacVien, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<CongTacVien, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CongTacVien, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((CongTacVien)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<CongTacVien, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<CongTacVien, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<CongTacVien, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((CongTacVien)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		CongTacVien.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		CongTacVien.class, ModelWrapper.class
	};

	private long _congTacVienId;
	private long _companyId;
	private long _groupId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _ma;
	private String _originalMa;
	private String _hoTen;
	private String _soCMND;
	private String _originalSoCMND;
	private Double _duNoToiDa;
	private Double _duNoToiDaTheChap;
	private String _diaChi;
	private String _ghiChu;
	private Boolean _hoatDong;
	private long _columnBitmask;
	private CongTacVien _escapedModel;

}