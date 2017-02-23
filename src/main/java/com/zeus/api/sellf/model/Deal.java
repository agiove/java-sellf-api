package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Deal implements Serializable, SellfModel {

	private static final long serialVersionUID = 9169499244817156193L;

	/** Unique identifier of the deal */
	private long id;
	
	/** Brief description of the deal */
	private String name;
	
	/** Estimated value of the deal, with decimal part if needed */
	private float value;
	
	/** To point if the deal is important or not */
	private boolean isHot;
	
	/** Probability of closing the deal successfully */
	private int winProbability;
	
	/** Estimated close date of the deal */
	private Date estimatedCloseAt;
	
	/** Date in which the deal has been opened */
	private Date startedAt;
	
	/** Last date in which the deal has been moved into a stage */
	private Date stageChangedAt;
	
	/** An array of tags for a deal */
	private List<String> tags;
	
	/** Unique identifier of a primary person */
	private long personId;
	
	/** Unique identifier of a primary company */
	private long companyId;
	
	/** Unique identifier of the deal’s current stage in the pipeline */
	private long stageId;
	
	/** Unique identifier of the deal source */
	private long sourceId;
	
	/** Unique identifier of the product (i.e. margin) associated to the deal */
	private long productId;
	
	/** Unique identifier of the user that the person is assigned to */
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

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public boolean isHot() {
		return isHot;
	}

	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}

	public int getWinProbability() {
		return winProbability;
	}

	public void setWinProbability(int winProbability) {
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

	public long getPersonId() {
		return personId;
	}

	public void setPersonId(long personId) {
		this.personId = personId;
	}

	public long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}

	public long getStageId() {
		return stageId;
	}

	public void setStageId(long stageId) {
		this.stageId = stageId;
	}

	public long getSourceId() {
		return sourceId;
	}

	public void setSourceId(long sourceId) {
		this.sourceId = sourceId;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
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
}
