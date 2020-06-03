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
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import com.mb.model.QuanLyMaSo;
import com.mb.model.QuanLyMaSoModel;
import com.mb.model.QuanLyMaSoSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the QuanLyMaSo service. Represents a row in the &quot;dm_quanlymaso&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface </code>QuanLyMaSoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuanLyMaSoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuanLyMaSoImpl
 * @generated
 */
@JSON(strict = true)
@ProviderType
public class QuanLyMaSoModelImpl
	extends BaseModelImpl<QuanLyMaSo> implements QuanLyMaSoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a quan ly ma so model instance should use the <code>QuanLyMaSo</code> interface instead.
	 */
	public static final String TABLE_NAME = "dm_quanlymaso";

	public static final Object[][] TABLE_COLUMNS = {
		{"quanLyMaSoId", Types.BIGINT}, {"key_", Types.VARCHAR},
		{"so", Types.INTEGER}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("quanLyMaSoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("key_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("so", Types.INTEGER);
	}

	public static final String TABLE_SQL_CREATE =
		"create table dm_quanlymaso (quanLyMaSoId LONG not null primary key,key_ VARCHAR(75) null,so INTEGER)";

	public static final String TABLE_SQL_DROP = "drop table dm_quanlymaso";

	public static final String ORDER_BY_JPQL =
		" ORDER BY quanLyMaSo.quanLyMaSoId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY dm_quanlymaso.quanLyMaSoId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		com.mb.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.com.mb.model.QuanLyMaSo"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		com.mb.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.com.mb.model.QuanLyMaSo"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		com.mb.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.com.mb.model.QuanLyMaSo"),
		true);

	public static final long KEY_COLUMN_BITMASK = 1L;

	public static final long QUANLYMASOID_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static QuanLyMaSo toModel(QuanLyMaSoSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		QuanLyMaSo model = new QuanLyMaSoImpl();

		model.setQuanLyMaSoId(soapModel.getQuanLyMaSoId());
		model.setKey(soapModel.getKey());
		model.setSo(soapModel.getSo());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<QuanLyMaSo> toModels(QuanLyMaSoSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<QuanLyMaSo> models = new ArrayList<QuanLyMaSo>(soapModels.length);

		for (QuanLyMaSoSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		com.mb.service.util.ServiceProps.get(
			"lock.expiration.time.com.mb.model.QuanLyMaSo"));

	public QuanLyMaSoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _quanLyMaSoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setQuanLyMaSoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _quanLyMaSoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QuanLyMaSo.class;
	}

	@Override
	public String getModelClassName() {
		return QuanLyMaSo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<QuanLyMaSo, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<QuanLyMaSo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuanLyMaSo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((QuanLyMaSo)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<QuanLyMaSo, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<QuanLyMaSo, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(QuanLyMaSo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<QuanLyMaSo, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<QuanLyMaSo, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<QuanLyMaSo, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<QuanLyMaSo, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<QuanLyMaSo, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<QuanLyMaSo, Object>>();
		Map<String, BiConsumer<QuanLyMaSo, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<QuanLyMaSo, ?>>();

		attributeGetterFunctions.put(
			"quanLyMaSoId",
			new Function<QuanLyMaSo, Object>() {

				@Override
				public Object apply(QuanLyMaSo quanLyMaSo) {
					return quanLyMaSo.getQuanLyMaSoId();
				}

			});
		attributeSetterBiConsumers.put(
			"quanLyMaSoId",
			new BiConsumer<QuanLyMaSo, Object>() {

				@Override
				public void accept(QuanLyMaSo quanLyMaSo, Object quanLyMaSoId) {
					quanLyMaSo.setQuanLyMaSoId((Long)quanLyMaSoId);
				}

			});
		attributeGetterFunctions.put(
			"key",
			new Function<QuanLyMaSo, Object>() {

				@Override
				public Object apply(QuanLyMaSo quanLyMaSo) {
					return quanLyMaSo.getKey();
				}

			});
		attributeSetterBiConsumers.put(
			"key",
			new BiConsumer<QuanLyMaSo, Object>() {

				@Override
				public void accept(QuanLyMaSo quanLyMaSo, Object key) {
					quanLyMaSo.setKey((String)key);
				}

			});
		attributeGetterFunctions.put(
			"so",
			new Function<QuanLyMaSo, Object>() {

				@Override
				public Object apply(QuanLyMaSo quanLyMaSo) {
					return quanLyMaSo.getSo();
				}

			});
		attributeSetterBiConsumers.put(
			"so",
			new BiConsumer<QuanLyMaSo, Object>() {

				@Override
				public void accept(QuanLyMaSo quanLyMaSo, Object so) {
					quanLyMaSo.setSo((Integer)so);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public long getQuanLyMaSoId() {
		return _quanLyMaSoId;
	}

	@Override
	public void setQuanLyMaSoId(long quanLyMaSoId) {
		_columnBitmask = -1L;

		_quanLyMaSoId = quanLyMaSoId;
	}

	@JSON
	@Override
	public String getKey() {
		if (_key == null) {
			return "";
		}
		else {
			return _key;
		}
	}

	@Override
	public void setKey(String key) {
		_columnBitmask |= KEY_COLUMN_BITMASK;

		if (_originalKey == null) {
			_originalKey = _key;
		}

		_key = key;
	}

	public String getOriginalKey() {
		return GetterUtil.getString(_originalKey);
	}

	@JSON
	@Override
	public int getSo() {
		return _so;
	}

	@Override
	public void setSo(int so) {
		_so = so;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			0, QuanLyMaSo.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QuanLyMaSo toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (QuanLyMaSo)ProxyUtil.newProxyInstance(
				_classLoader, _escapedModelInterfaces,
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QuanLyMaSoImpl quanLyMaSoImpl = new QuanLyMaSoImpl();

		quanLyMaSoImpl.setQuanLyMaSoId(getQuanLyMaSoId());
		quanLyMaSoImpl.setKey(getKey());
		quanLyMaSoImpl.setSo(getSo());

		quanLyMaSoImpl.resetOriginalValues();

		return quanLyMaSoImpl;
	}

	@Override
	public int compareTo(QuanLyMaSo quanLyMaSo) {
		int value = 0;

		if (getQuanLyMaSoId() < quanLyMaSo.getQuanLyMaSoId()) {
			value = -1;
		}
		else if (getQuanLyMaSoId() > quanLyMaSo.getQuanLyMaSoId()) {
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

		if (!(obj instanceof QuanLyMaSo)) {
			return false;
		}

		QuanLyMaSo quanLyMaSo = (QuanLyMaSo)obj;

		long primaryKey = quanLyMaSo.getPrimaryKey();

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
		QuanLyMaSoModelImpl quanLyMaSoModelImpl = this;

		quanLyMaSoModelImpl._originalKey = quanLyMaSoModelImpl._key;

		quanLyMaSoModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<QuanLyMaSo> toCacheModel() {
		QuanLyMaSoCacheModel quanLyMaSoCacheModel = new QuanLyMaSoCacheModel();

		quanLyMaSoCacheModel.quanLyMaSoId = getQuanLyMaSoId();

		quanLyMaSoCacheModel.key = getKey();

		String key = quanLyMaSoCacheModel.key;

		if ((key != null) && (key.length() == 0)) {
			quanLyMaSoCacheModel.key = null;
		}

		quanLyMaSoCacheModel.so = getSo();

		return quanLyMaSoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<QuanLyMaSo, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<QuanLyMaSo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuanLyMaSo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((QuanLyMaSo)this));
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
		Map<String, Function<QuanLyMaSo, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<QuanLyMaSo, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuanLyMaSo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((QuanLyMaSo)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static final ClassLoader _classLoader =
		QuanLyMaSo.class.getClassLoader();
	private static final Class<?>[] _escapedModelInterfaces = new Class[] {
		QuanLyMaSo.class, ModelWrapper.class
	};

	private long _quanLyMaSoId;
	private String _key;
	private String _originalKey;
	private int _so;
	private long _columnBitmask;
	private QuanLyMaSo _escapedModel;

}