package com.zeus.api.sellf.model;

import java.io.Serializable;
import java.util.Date;

public class Stage implements Serializable, SellfModel {

	private static final long serialVersionUID = -3819059535895726376L;

	/** Unique identifier of the stage */
	private long id;
	
	/** Name of the stage */
	private String name;
	
	/** The likelihood that a deal will be won, as percentage */
	private int winProbability;
	
	/** The position of the stage in the pipeline */
	private int position;
	
	/** Unique identifier of the associated pipeline */
	private long pipelineId;
	
	/** Stage type (i.e. active, won, lost, abandoned) */
	private int type;
	
	/** Date of creation */
	private Date createdAt;
	
	/** Date of last edit */
	private Date updatedAt;

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getWinProbability() {
		return winProbability;
	}

	public int getPosition() {
		return position;
	}

	public long getPipelineId() {
		return pipelineId;
	}

	public int getType() {
		return type;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}
}
