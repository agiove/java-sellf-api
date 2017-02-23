package com.zeus.api.sellf.response;

import java.util.List;

import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.SellfModel;

public abstract class GetListResponse<S extends SellfModel> extends BaseResponse {
	
	private List<S> data;
	
	public List<S> list() {
		return data;
	}
}
