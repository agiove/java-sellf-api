package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class AppointmentPerson implements Serializable, SellfModel {

	private static final long serialVersionUID = 1891681674163381225L;

	/** Unique identifier of the person related to the appointment */
	private Long personId;
	
	/** Date of last edit */
	private Date updateAt;

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Date getUpdateAt() {
		return updateAt;
	}
}
