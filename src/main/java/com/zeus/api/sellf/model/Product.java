package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class Product implements Serializable, SellfModel {

	private static final long serialVersionUID = 5223021977783057432L;

	/** Unique identifier of the product */
	private long id;
	
	/** Name of the product */
	private String name;
	
	/** A percentage applied to the estimated value of a deal */
	private int netRate;
	
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

	public int getNetRate() {
		return netRate;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
}
