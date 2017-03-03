package com.zeus.api.sellf.exc;

public class SellfApiRequestException extends Exception {

	private static final long serialVersionUID = 6435406223585660848L;
	
	private int httpCode;
	private String jsonBody;

	public SellfApiRequestException() {
		super();
	}
	
	public SellfApiRequestException(int httpCode, String msg, String jsonBody) {
		super(msg + " - " + jsonBody);
		this.httpCode = httpCode;
		this.jsonBody = jsonBody;
	}
	
	public SellfApiRequestException(int httpCode, String msg) {
		super(msg);
		this.httpCode = httpCode;
	}
	
	public SellfApiRequestException(String msg) {
		super(msg);
	}
	
	public SellfApiRequestException(Throwable e) {
		super(e);
	}
	
	public int getHttpCode() {
		return httpCode;
	}
}
