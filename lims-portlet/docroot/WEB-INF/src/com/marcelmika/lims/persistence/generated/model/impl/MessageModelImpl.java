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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.marcelmika.lims.persistence.generated.model.Message;
import com.marcelmika.lims.persistence.generated.model.MessageModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Message service. Represents a row in the &quot;Lims_Message&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.marcelmika.lims.persistence.generated.model.MessageModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link MessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MessageImpl
 * @see com.marcelmika.lims.persistence.generated.model.Message
 * @see com.marcelmika.lims.persistence.generated.model.MessageModel
 * @generated
 */
public class MessageModelImpl extends BaseModelImpl<Message>
	implements MessageModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a message model instance should use the {@link com.marcelmika.lims.persistence.generated.model.Message} interface instead.
	 */
	public static final String TABLE_NAME = "Lims_Message";
	public static final Object[][] TABLE_COLUMNS = {
			{ "mid", Types.BIGINT },
			{ "cid", Types.BIGINT },
			{ "creatorId", Types.BIGINT },
			{ "createdAt", Types.TIMESTAMP },
			{ "body", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Lims_Message (mid LONG not null primary key,cid LONG,creatorId LONG,createdAt DATE null,body TEXT null)";
	public static final String TABLE_SQL_DROP = "drop table Lims_Message";
	public static final String ORDER_BY_JPQL = " ORDER BY message.createdAt ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Lims_Message.createdAt ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.marcelmika.lims.persistence.generated.model.Message"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.marcelmika.lims.persistence.generated.model.Message"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.marcelmika.lims.persistence.generated.model.Message"),
			true);
	public static long CID_COLUMN_BITMASK = 1L;
	public static long CREATORID_COLUMN_BITMASK = 2L;
	public static long CREATEDAT_COLUMN_BITMASK = 4L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.marcelmika.lims.persistence.generated.model.Message"));

	public MessageModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _mid;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setMid(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _mid;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Message.class;
	}

	@Override
	public String getModelClassName() {
		return Message.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("mid", getMid());
		attributes.put("cid", getCid());
		attributes.put("creatorId", getCreatorId());
		attributes.put("createdAt", getCreatedAt());
		attributes.put("body", getBody());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long mid = (Long)attributes.get("mid");

		if (mid != null) {
			setMid(mid);
		}

		Long cid = (Long)attributes.get("cid");

		if (cid != null) {
			setCid(cid);
		}

		Long creatorId = (Long)attributes.get("creatorId");

		if (creatorId != null) {
			setCreatorId(creatorId);
		}

		Date createdAt = (Date)attributes.get("createdAt");

		if (createdAt != null) {
			setCreatedAt(createdAt);
		}

		String body = (String)attributes.get("body");

		if (body != null) {
			setBody(body);
		}
	}

	@Override
	public long getMid() {
		return _mid;
	}

	@Override
	public void setMid(long mid) {
		_mid = mid;
	}

	@Override
	public long getCid() {
		return _cid;
	}

	@Override
	public void setCid(long cid) {
		_columnBitmask |= CID_COLUMN_BITMASK;

		if (!_setOriginalCid) {
			_setOriginalCid = true;

			_originalCid = _cid;
		}

		_cid = cid;
	}

	public long getOriginalCid() {
		return _originalCid;
	}

	@Override
	public long getCreatorId() {
		return _creatorId;
	}

	@Override
	public void setCreatorId(long creatorId) {
		_columnBitmask |= CREATORID_COLUMN_BITMASK;

		if (!_setOriginalCreatorId) {
			_setOriginalCreatorId = true;

			_originalCreatorId = _creatorId;
		}

		_creatorId = creatorId;
	}

	public long getOriginalCreatorId() {
		return _originalCreatorId;
	}

	@Override
	public Date getCreatedAt() {
		return _createdAt;
	}

	@Override
	public void setCreatedAt(Date createdAt) {
		_columnBitmask = -1L;

		_createdAt = createdAt;
	}

	@Override
	public String getBody() {
		if (_body == null) {
			return StringPool.BLANK;
		}
		else {
			return _body;
		}
	}

	@Override
	public void setBody(String body) {
		_body = body;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(0,
			Message.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Message toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Message)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		MessageImpl messageImpl = new MessageImpl();

		messageImpl.setMid(getMid());
		messageImpl.setCid(getCid());
		messageImpl.setCreatorId(getCreatorId());
		messageImpl.setCreatedAt(getCreatedAt());
		messageImpl.setBody(getBody());

		messageImpl.resetOriginalValues();

		return messageImpl;
	}

	@Override
	public int compareTo(Message message) {
		int value = 0;

		value = DateUtil.compareTo(getCreatedAt(), message.getCreatedAt());

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

		if (!(obj instanceof Message)) {
			return false;
		}

		Message message = (Message)obj;

		long primaryKey = message.getPrimaryKey();

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
		MessageModelImpl messageModelImpl = this;

		messageModelImpl._originalCid = messageModelImpl._cid;

		messageModelImpl._setOriginalCid = false;

		messageModelImpl._originalCreatorId = messageModelImpl._creatorId;

		messageModelImpl._setOriginalCreatorId = false;

		messageModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Message> toCacheModel() {
		MessageCacheModel messageCacheModel = new MessageCacheModel();

		messageCacheModel.mid = getMid();

		messageCacheModel.cid = getCid();

		messageCacheModel.creatorId = getCreatorId();

		Date createdAt = getCreatedAt();

		if (createdAt != null) {
			messageCacheModel.createdAt = createdAt.getTime();
		}
		else {
			messageCacheModel.createdAt = Long.MIN_VALUE;
		}

		messageCacheModel.body = getBody();

		String body = messageCacheModel.body;

		if ((body != null) && (body.length() == 0)) {
			messageCacheModel.body = null;
		}

		return messageCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(11);

		sb.append("{mid=");
		sb.append(getMid());
		sb.append(", cid=");
		sb.append(getCid());
		sb.append(", creatorId=");
		sb.append(getCreatorId());
		sb.append(", createdAt=");
		sb.append(getCreatedAt());
		sb.append(", body=");
		sb.append(getBody());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(19);

		sb.append("<model><model-name>");
		sb.append("com.marcelmika.lims.persistence.generated.model.Message");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>mid</column-name><column-value><![CDATA[");
		sb.append(getMid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>cid</column-name><column-value><![CDATA[");
		sb.append(getCid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>creatorId</column-name><column-value><![CDATA[");
		sb.append(getCreatorId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createdAt</column-name><column-value><![CDATA[");
		sb.append(getCreatedAt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>body</column-name><column-value><![CDATA[");
		sb.append(getBody());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Message.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Message.class
		};
	private long _mid;
	private long _cid;
	private long _originalCid;
	private boolean _setOriginalCid;
	private long _creatorId;
	private long _originalCreatorId;
	private boolean _setOriginalCreatorId;
	private Date _createdAt;
	private String _body;
	private long _columnBitmask;
	private Message _escapedModel;
}