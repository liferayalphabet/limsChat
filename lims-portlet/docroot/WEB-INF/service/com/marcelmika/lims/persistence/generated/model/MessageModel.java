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

package com.marcelmika.lims.persistence.generated.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Message service. Represents a row in the &quot;Lims_Message&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.marcelmika.lims.persistence.generated.model.impl.MessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.marcelmika.lims.persistence.generated.model.impl.MessageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Message
 * @see com.marcelmika.lims.persistence.generated.model.impl.MessageImpl
 * @see com.marcelmika.lims.persistence.generated.model.impl.MessageModelImpl
 * @generated
 */
public interface MessageModel extends BaseModel<Message> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a message model instance should use the {@link Message} interface instead.
	 */

	/**
	 * Returns the primary key of this message.
	 *
	 * @return the primary key of this message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this message.
	 *
	 * @param primaryKey the primary key of this message
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mid of this message.
	 *
	 * @return the mid of this message
	 */
	public long getMid();

	/**
	 * Sets the mid of this message.
	 *
	 * @param mid the mid of this message
	 */
	public void setMid(long mid);

	/**
	 * Returns the cid of this message.
	 *
	 * @return the cid of this message
	 */
	public long getCid();

	/**
	 * Sets the cid of this message.
	 *
	 * @param cid the cid of this message
	 */
	public void setCid(long cid);

	/**
	 * Returns the creator ID of this message.
	 *
	 * @return the creator ID of this message
	 */
	public long getCreatorId();

	/**
	 * Sets the creator ID of this message.
	 *
	 * @param creatorId the creator ID of this message
	 */
	public void setCreatorId(long creatorId);

	/**
	 * Returns the created at of this message.
	 *
	 * @return the created at of this message
	 */
	public Date getCreatedAt();

	/**
	 * Sets the created at of this message.
	 *
	 * @param createdAt the created at of this message
	 */
	public void setCreatedAt(Date createdAt);

	/**
	 * Returns the body of this message.
	 *
	 * @return the body of this message
	 */
	@AutoEscape
	public String getBody();

	/**
	 * Sets the body of this message.
	 *
	 * @param body the body of this message
	 */
	public void setBody(String body);

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
	public int compareTo(Message message);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Message> toCacheModel();

	@Override
	public Message toEscapedModel();

	@Override
	public Message toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}