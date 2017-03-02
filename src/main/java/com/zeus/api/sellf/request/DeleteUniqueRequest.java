package com.zeus.api.sellf.request;

import java.util.HashMap;
import java.util.Map;

import com.zeus.api.sellf.BaseRequest;
import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.SellfModel;
import com.zeus.api.sellf.request.method.Delete;

public abstract class DeleteUniqueRequest <R extends BaseResponse, S extends SellfModel> extends BaseRequest<R> implements Delete {

	private String entity;
	private long id;
	
	public DeleteUniqueRequest(String entity, long id, Class<R> responseClass) {
		super(responseClass);
		this.entity = entity;
		this.id = id;
	}

	@Override
	public String urlPart() {
		return entity.replaceAll(":id", String.valueOf(id));
	}

	@Override
	public Map<String, Object> params() {
		return new HashMap<String, Object>();
	}
}
