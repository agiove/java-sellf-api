package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable, SellfModel {

	private static final long serialVersionUID = -1960813042767271593L;

	/** Unique identifier of the user */
	private Long id;
	
	/** Email address of the user */
	private String email;
	
	/** Name of the user */
	private String name;
	
	/** Date of creation */
	private Date createdAt;

	public Long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getName() {
		return name;
	}

	public Date getCreatedAt() {
		return createdAt;
	}
}
