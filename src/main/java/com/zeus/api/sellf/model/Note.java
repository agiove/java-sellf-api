package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

import com.zeus.api.sellf.annotation.RequiredField;

public class Note implements Serializable, SellfModel {

	private static final long serialVersionUID = 7832936336665563847L;

	/** Unique identifier of the note */
	private Long id;
	
	/** Title of the note */
	@RequiredField private String title;
	
	/** Content of the note */
	private String body;
	
	/** Unique identifier of the person related to the note */
	private Long contactId;
	
	/** Unique identifier of the company related to the note */
	private Long companyId;
	
	/** Unique identifier of the deal concerning the note */
	private Long dealId;
	
	/** Unique identifier of the user that the note is assigned to */
	@RequiredField private Long userId;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getDealId() {
		return dealId;
	}

	public void setDealId(Long dealId) {
		this.dealId = dealId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
}
