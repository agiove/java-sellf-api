package com.zeus.api.sellf;

import java.lang.reflect.Type;
import java.util.Map;

public abstract class BaseRequest<R extends BaseResponse> {

	private final Class<? extends R> responseClass;
	
	public BaseRequest(Class<? extends R> responseClass) {
        this.responseClass = responseClass;
	}
	
	public abstract String urlPart();
	
	public abstract Map<String, Object> params();
	
	public Type getResponseType() {
        return responseClass;
	}
}
