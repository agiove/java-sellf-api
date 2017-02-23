package com.zeus.api.sellf.request;

import java.util.HashMap;
import java.util.Map;

import com.zeus.api.sellf.BaseRequest;
import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.SellfModel;
import com.zeus.api.sellf.request.method.Post;

public abstract class PostUniqueRequest<R extends BaseResponse, S extends SellfModel> extends BaseRequest<R> implements Post {

	private String entity;
	private S data;
	
	public PostUniqueRequest(String entity, S data, Class<? extends R> responseClass) {
		super(responseClass);
		this.entity = entity;
		this.data = data;
	}

	@Override
	public String urlPart() {
		return entity;
	}

	@Override
	public Map<String, Object> params() {
		return new HashMap<String, Object>();
	}
	
	public SellfModel getData() {
		return data;
	}
}
