package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class Appointment implements Serializable, SellfModel {
	
	private static final long serialVersionUID = -6423126057239995723L;

	/** Unique identifier of the appointment */
	private long id;
	
	/** Name of the appointment */
	private String name;
	
	/** 
	 * Type of appointment 
	 * 
	 * call 	Phone call
	 * meeting 	Meeting
	 * lunch 	Lunch
	 * dinner 	Dinner
	 * presentation 	Presentation
	 * */
	private String action;
	
	/** Moment in which the appointment starts */
	private Date startAt;
	
	/** Moment in which the appointment ends */
	private Date endAt;
	
	/** At what time the user needs to be notified of the upcoming appointment */
	private Date remindAt;
	
	/** It determines whether the appointment lasts all day or less */
	private boolean isAllDay;
	
	/** Place in which the appointment occurs */
	private String address;
	
	/** Appointment’s notes */
	private String description;
	
	/** Unique identifier of the deal concerning the appointment */
	private long dealId;
	
	/** Unique identifier of the user that the appointment is assigned to */
	private long userId;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public Date getStartAt() {
		return startAt;
	}

	public void setStartAt(Date startAt) {
		this.startAt = startAt;
	}

	public Date getEndAt() {
		return endAt;
	}

	public void setEndAt(Date endAt) {
		this.endAt = endAt;
	}

	public Date getRemindAt() {
		return remindAt;
	}

	public void setRemindAt(Date remindAt) {
		this.remindAt = remindAt;
	}

	public boolean isAllDay() {
		return isAllDay;
	}

	public void setAllDay(boolean isAllDay) {
		this.isAllDay = isAllDay;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getDealId() {
		return dealId;
	}

	public void setDealId(long dealId) {
		this.dealId = dealId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getId() {
		return id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
}
