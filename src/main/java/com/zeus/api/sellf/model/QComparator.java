package com.zeus.api.sellf.model;

public enum QComparator {
	
	EQ("eq"), NEQ("neq"), LT("lt"), GT("gt"), LTE("lte"), GTE("gte"), IN("in"), CONTAINS("contains");
	
	private String value;
	
	QComparator(String value){
		this.value = value;
	}
	
	public String value() {
		return value;
	}
}