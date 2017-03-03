package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Person implements Serializable, SellfModel {

	private static final long serialVersionUID = 65090814767879981L;

	/** Unique identifier of the person */
	private Long id;
	
	/** First name of the person */
	private String firstName;
	
	/** Last name of the person */
	private String lastName;
	
	/** Role in the company */
	private String title;
	
	/** Website */
	private String website;
	
	/** Primary email */
	private String email;
	
	/** Secondary email */
	private String emailSecondary;
	
	/** Office or home number */
	private String phone;
	
	/** Mobile phone number */
	private String mobile;
	
	/** Fax number */
	private String fax;
	
	/** Skype nickname */
	private String skype;
	
	/** Office or home address of the person */
	private String address;
	
	/** Geographic coordinate of the person */
	private Float latitude; 
	
	/** Geographic coordinate of the person */
	private Float longitude;
	
	private String description;
	
	/** An array of tags for a person */
	private List<String> tags;
	
	/** Unique identifier of the person�s company */
	private Long companyId;
	
	/** Unique identifier of the user that the person is assigned to */
	private Long userId;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getSkype() {
		return skype;
	}

	public void setSkype(String skype) {
		this.skype = skype;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getLatitude() {
		return latitude;
	}

	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}

	public Float getLongitude() {
		return longitude;
	}

	public void setLongitude(Float longitude) {
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

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
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
