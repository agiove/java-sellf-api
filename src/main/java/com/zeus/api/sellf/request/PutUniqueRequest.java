package com.zeus.api.sellf.request;

import java.util.HashMap;
import java.util.Map;

import com.zeus.api.sellf.BaseRequest;
import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.SellfModel;
import com.zeus.api.sellf.request.method.Put;

public abstract class PutUniqueRequest<R extends BaseResponse, S extends SellfModel> extends BaseRequest<R> implements Put {

	private String entity;
	private long id;
	private S data;
	
	public PutUniqueRequest(String entity, long id, S data, Class<? extends R> responseClass) {
		super(responseClass);
		this.entity = entity;
		this.id = id;
		this.data = data;
	}

	@Override
	public String urlPart() {
		return entity.replaceAll(":id", String.valueOf(id));
	}

	@Override
	public Map<String, Object> params() {
		return new HashMap<String, Object>();
	}
	
	public SellfModel getData() {
		return data;
	}
}
