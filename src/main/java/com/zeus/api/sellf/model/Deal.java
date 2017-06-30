package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.zeus.api.sellf.annotation.RequiredField;

public class Deal implements Serializable, SellfModel {

	private static final long serialVersionUID = 9169499244817156193L;

	/** Unique identifier of the deal */
	private Long id;
	
	/** Brief description of the deal */
	@RequiredField private String name;
	
	/** Estimated value of the deal, with decimal part if needed */
	private Float value;
	
	/** To point if the deal is important or not */
	private Boolean isHot;
	
	/** Probability of closing the deal successfully */
	private Integer winProbability;
	
	/** Estimated close date of the deal */
	private Date estimatedCloseAt;
	
	/** Date in which the deal has been opened */
	private Date startedAt;
	
	/** Last date in which the deal has been moved into a stage */
	private Date stageChangedAt;
	
	/** An array of tags for a deal */
	private List<String> tags;
	
	/** Unique identifier of a primary person */
	private Long personId;
	
	/** Unique identifier of a primary company */
	private Long companyId;
	
	/** Unique identifier of the deal�s current stage in the pipeline */
	@RequiredField private Long stageId;
	
	/** Unique identifier of the deal source */
	private Long sourceId;
	
	/** Unique identifier of the product (i.e. margin) associated to the deal */
	private Long productId;
	
	/** Unique identifier of the user that the person is assigned to */
	@RequiredField private Long userId;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;
	
	private Map<String, Object> customFields;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getValue() {
		return value;
	}

	public void setValue(Float value) {
		this.value = value;
	}

	public Boolean isHot() {
		return isHot;
	}

	public void setHot(Boolean isHot) {
		this.isHot = isHot;
	}

	public Integer getWinProbability() {
		return winProbability;
	}

	public void setWinProbability(Integer winProbability) {
		this.winProbability = winProbability;
	}

	public Date getEstimatedCloseAt() {
		return estimatedCloseAt;
	}

	public void setEstimatedCloseAt(Date estimatedCloseAt) {
		this.estimatedCloseAt = estimatedCloseAt;
	}

	public List<String> getTags() {
		return tags;
	}

	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	public Long getPersonId() {
		return personId;
	}

	public void setPersonId(Long personId) {
		this.personId = personId;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getStageId() {
		return stageId;
	}

	public void setStageId(Long stageId) {
		this.stageId = stageId;
	}

	public Long getSourceId() {
		return sourceId;
	}

	public void setSourceId(Long sourceId) {
		this.sourceId = sourceId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
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

	public Date getStartedAt() {
		return startedAt;
	}

	public Date getStageChangedAt() {
		return stageChangedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	public Map<String, Object> getCustomFields() {
		return customFields;
	}

	public void setCustomFields(Map<String, Object> customFields) {
		this.customFields = customFields;
	} 
}
