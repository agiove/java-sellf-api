package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Company implements Serializable, SellfModel {

	private static final long serialVersionUID = 2600849591371422867L;

	/** Unique identifier of the company */
	private long id;
	
	/** Name of the company */
	private String name;
	
	/** Industry sector of the company */
	private String industry;
	
	/** website */
	private String website;
	
	/** Primary email */
	private String email;
	
	/** Secondary email */
	private String emailSecondary;
	
	/** Office or home number */
	private String phone;
	
	/** Fax number */
	private String fax;
	
	/** Office or home address of the company */
	private String address;
	
	/** Geographic coordinate of the company */
	private float latitude;
	
	/** Geographic coordinate of the company */
	private float longitude;
	
	/** Description */ 
	private String description;
	
	/** An array of tags for a company */
	private List<String> tags;
	
	/** Unique identifier of the user that the company is assigned to */
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

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailSecondary() {
		return emailSecondary;
	}

	public void setEmailSecondary(String emailSecondary) {
		this.emailSecondary = emailSecondary;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
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
