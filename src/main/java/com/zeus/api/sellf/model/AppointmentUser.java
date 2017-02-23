package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class AppointmentUser implements Serializable, SellfModel {

	private static final long serialVersionUID = 3279324106116655080L;

	/** Unique identifier of the user related to the appointment */
	private long userId;
	
	/** Date of last edit */
	private Date updateAt;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getUpdateAt() {
		return updateAt;
	}
}
