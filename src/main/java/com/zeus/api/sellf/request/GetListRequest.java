package com.zeus.api.sellf.request;

import java.util.HashMap;
import java.util.Map;

import com.zeus.api.sellf.BaseRequest;
import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.SellfModel;
import com.zeus.api.sellf.request.method.Get;

public abstract class GetListRequest<R extends BaseResponse, S extends SellfModel> extends BaseRequest<R> implements Get {

	private String entity;
	
	private int pageNum = -1;
	private String sortByField = null;
	
	public GetListRequest(String entity, Class<R> responseClass) {
		super(responseClass);
		this.entity = entity;
	}
	
	public GetListRequest<R, S> page(int pageNum) {
		this.pageNum = pageNum;
		return this;
	}
	
	public GetListRequest<R, S> sortBy(String field, boolean asc) {
		this.sortByField = (asc ? "" : "-") + field;
		return this;
	}
	
	@Override
	public String urlPart() {
		return entity;
	}
	
	@Override
	public Map<String, Object> params() {
		Map<String, Object> params = new HashMap<String, Object>();
		if(pageNum > 0){
			params.put("page", pageNum);
		}
		if(sortByField != null){
			params.put("sort_by", sortByField);
		}
		return params;
	}
	
}
