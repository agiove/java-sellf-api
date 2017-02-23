package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Deal;

public class GetDealResponse extends GetUniqueResponse<Deal> {

	public Type getType() {
		return Deal.class;
	}
}
