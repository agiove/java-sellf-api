package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class Source implements Serializable, SellfModel {

	private static final long serialVersionUID = -3034805484930242967L;

	/** Unique identifier of the source */
	private long id;
	
	/** Name of the source */
	private String name;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
}
