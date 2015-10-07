/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.marcelmika.lims.persistence.generated.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.marcelmika.lims.persistence.generated.model.Settings;
import com.marcelmika.lims.persistence.generated.model.SettingsModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Settings service. Represents a row in the &quot;Lims_Settings&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.marcelmika.lims.persistence.generated.model.SettingsModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SettingsImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SettingsImpl
 * @see com.marcelmika.lims.persistence.generated.model.Settings
 * @see com.marcelmika.lims.persistence.generated.model.SettingsModel
 * @generated
 */
public class SettingsModelImpl extends BaseModelImpl<Settings>
	implements SettingsModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a settings model instance should use the {@link com.marcelmika.lims.persistence.generated.model.Settings} interface instead.
	 */
	public static final String TABLE_NAME = "Lims_Settings";
	public static final Object[][] TABLE_COLUMNS = {
			{ "sid", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "presence", Types.VARCHAR },
			{ "presenceUpdatedAt", Types.BIGINT },
			{ "mute", Types.BOOLEAN },
			{ "chatEnabled", Types.BOOLEAN },
			{ "adminAreaOpened", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table Lims_Settings (sid LONG not null primary key,userId LONG,presence VARCHAR(75) null,presenceUpdatedAt LONG,mute BOOLEAN,chatEnabled BOOLEAN,adminAreaOpened BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table Lims_Settings";
	public static final String ORDER_BY_JPQL = " ORDER BY settings.sid ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Lims_Settings.sid ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.marcelmika.lims.persistence.generated.model.Settings"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.marcelmika.lims.persistence.generated.model.Settings"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.marcelmika.lims.persistence.generated.model.Settings"),
			true);
	public static long PRESENCE_COLUMN_BITMASK = 1L;
	public static long USERID_COLUMN_BITMASK = 2L;
	public static long SID_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.marcelmika.lims.persistence.generated.model.Settings"));

	public SettingsModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Settings.class;
	}

	@Override
	public String getModelClassName() {
		return Settings.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sid", getSid());
		attributes.put("userId", getUserId());
		attributes.put("presence", getPresence());
		attributes.put("presenceUpdatedAt", getPresenceUpdatedAt());
		attributes.put("mute", getMute());
		attributes.put("chatEnabled", getChatEnabled());
		attributes.put("adminAreaOpened", getAdminAreaOpened());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sid = (Long)attributes.get("sid");

		if (sid != null) {
			setSid(sid);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String presence = (String)attributes.get("presence");

		if (presence != null) {
			setPresence(presence);
		}

		Long presenceUpdatedAt = (Long)attributes.get("presenceUpdatedAt");

		if (presenceUpdatedAt != null) {
			setPresenceUpdatedAt(presenceUpdatedAt);
		}

		Boolean mute = (Boolean)attributes.get("mute");

		if (mute != null) {
			setMute(mute);
		}

		Boolean chatEnabled = (Boolean)attributes.get("chatEnabled");

		if (chatEnabled != null) {
			setChatEnabled(chatEnabled);
		}

		Boolean adminAreaOpened = (Boolean)attributes.get("adminAreaOpened");

		if (adminAreaOpened != null) {
			setAdminAreaOpened(adminAreaOpened);
		}
	}

	@Override
	public long getSid() {
		return _sid;
	}

	@Override
	public void setSid(long sid) {
		_sid = sid;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask |= USERID_COLUMN_BITMASK;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@Override
	public String getPresence() {
		if (_presence == null) {
			return StringPool.BLANK;
		}
		else {
			return _presence;
		}
	}

	@Override
	public void setPresence(String presence) {
		_columnBitmask |= PRESENCE_COLUMN_BITMASK;

		if (_originalPresence == null) {
			_originalPresence = _presence;
		}

		_presence = presence;
	}

	public String getOriginalPresence() {
		return GetterUtil.getString(_originalPresence);
	}

	@Override
	public long getPresenceUpdatedAt() {
		return _presenceUpdatedAt;
	}

	@Override
	public void setPresenceUpdatedAt(long presenceUpdatedAt) {
		_presenceUpdatedAt = presenceUpdatedAt;
	}

	@Override
	public boolean getMute() {
		return _mute;
	}

	@Override
	public boolean isMute() {
		return _mute;
	}

	@Override
	public void setMute(boolean mute) {
		_mute = mute;
	}

	@Override
	public boolean getChatEnabled() {
		return _chatEnabled;
	}

	@Override
	public boolean isChatEnabled() {
		return _chatEnabled;
	}

	@Override
	public void setChatEnabled(boolean chatEnabled) {
		_chatEnabled = chatEnabled;
	}

	@Override
	public boolean getAdminAreaOpened() {
		return _adminAreaOpened;
	}

	@Override
	public boolean isAdminAreaOpened() {
		return _adminAreaOpened;
	}

	@Override
	public void setAdminAreaOpened(boolean adminAreaOpened) {
		_adminAreaOpened = adminAreaOpened;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Settings.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Settings toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Settings)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SettingsImpl settingsImpl = new SettingsImpl();

		settingsImpl.setSid(getSid());
		settingsImpl.setUserId(getUserId());
		settingsImpl.setPresence(getPresence());
		settingsImpl.setPresenceUpdatedAt(getPresenceUpdatedAt());
		settingsImpl.setMute(getMute());
		settingsImpl.setChatEnabled(getChatEnabled());
		settingsImpl.setAdminAreaOpened(getAdminAreaOpened());

		settingsImpl.resetOriginalValues();

		return settingsImpl;
	}

	@Override
	public int compareTo(Settings settings) {
		long primaryKey = settings.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Settings)) {
			return false;
		}

		Settings settings = (Settings)obj;

		long primaryKey = settings.getPrimaryKey();

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
	public void resetOriginalValues() {
		SettingsModelImpl settingsModelImpl = this;

		settingsModelImpl._originalUserId = settingsModelImpl._userId;

		settingsModelImpl._setOriginalUserId = false;

		settingsModelImpl._originalPresence = settingsModelImpl._presence;

		settingsModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Settings> toCacheModel() {
		SettingsCacheModel settingsCacheModel = new SettingsCacheModel();

		settingsCacheModel.sid = getSid();

		settingsCacheModel.userId = getUserId();

		settingsCacheModel.presence = getPresence();

		String presence = settingsCacheModel.presence;

		if ((presence != null) && (presence.length() == 0)) {
			settingsCacheModel.presence = null;
		}

		settingsCacheModel.presenceUpdatedAt = getPresenceUpdatedAt();

		settingsCacheModel.mute = getMute();

		settingsCacheModel.chatEnabled = getChatEnabled();

		settingsCacheModel.adminAreaOpened = getAdminAreaOpened();

		return settingsCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(15);

		sb.append("{sid=");
		sb.append(getSid());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", presence=");
		sb.append(getPresence());
		sb.append(", presenceUpdatedAt=");
		sb.append(getPresenceUpdatedAt());
		sb.append(", mute=");
		sb.append(getMute());
		sb.append(", chatEnabled=");
		sb.append(getChatEnabled());
		sb.append(", adminAreaOpened=");
		sb.append(getAdminAreaOpened());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(25);

		sb.append("<model><model-name>");
		sb.append("com.marcelmika.lims.persistence.generated.model.Settings");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>sid</column-name><column-value><![CDATA[");
		sb.append(getSid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>presence</column-name><column-value><![CDATA[");
		sb.append(getPresence());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>presenceUpdatedAt</column-name><column-value><![CDATA[");
		sb.append(getPresenceUpdatedAt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>mute</column-name><column-value><![CDATA[");
		sb.append(getMute());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>chatEnabled</column-name><column-value><![CDATA[");
		sb.append(getChatEnabled());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>adminAreaOpened</column-name><column-value><![CDATA[");
		sb.append(getAdminAreaOpened());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Settings.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Settings.class
		};
	private long _sid;
	private long _userId;
	private String _userUuid;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _presence;
	private String _originalPresence;
	private long _presenceUpdatedAt;
	private boolean _mute;
	private boolean _chatEnabled;
	private boolean _adminAreaOpened;
	private long _columnBitmask;
	private Settings _escapedModel;
}