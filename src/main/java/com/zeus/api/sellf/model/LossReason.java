package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class LossReason implements Serializable, SellfModel {

	private static final long serialVersionUID = 1802314800168614422L;

	/** Unique identifier of the loss reason */
	private Long id;
	
	/** Name of the loss reason */
	private String name;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;

	public Long getId() {
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
