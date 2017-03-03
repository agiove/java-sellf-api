package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class AppointmentCompany implements Serializable, SellfModel {

	private static final long serialVersionUID = -4106905679118885203L;

	/** Unique identifier of the company related to the appointment */
	private Long companyId;
	
	/** Date of last edit */
	private Date updateAt;

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Date getUpdateAt() {
		return updateAt;
	}
}
