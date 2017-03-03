package com.zeus.api.sellf.model;

import java.io.Serializable;

public class Pipeline implements Serializable, SellfModel {

	private static final long serialVersionUID = 1678684584304252686L;

	/** Unique identifier of the pipeline */
	private Long id;
	
	/** Name of the pipeline */
	private String name;
	
	/** Pipeline type (i.e. money, quantity) */
	private String type;

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}
	
}
