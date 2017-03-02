package com.zeus.api.sellf;

import java.util.Map;

public abstract class BaseRequest<R extends BaseResponse> {

	private final Class<R> responseClass;
	
	public BaseRequest(Class<R> responseClass) {
        this.responseClass = responseClass;
	}
	
	public abstract String urlPart();
	
	public abstract Map<String, Object> params();
	
	public Class<R> getResponseType() {
        return responseClass;
	}
}
