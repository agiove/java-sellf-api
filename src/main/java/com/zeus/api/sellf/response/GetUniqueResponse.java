package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.SellfModel;

public abstract class GetUniqueResponse<S extends SellfModel> extends BaseResponse {

	private S data;
	
	public abstract Type getType();
	
	public S get() {
		return data;
	}
	
	public void setData(S data) {
		this.data = data;
	}
}
