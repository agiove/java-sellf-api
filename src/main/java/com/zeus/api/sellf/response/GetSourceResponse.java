package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Source;

public class GetSourceResponse extends GetUniqueResponse<Source> {

	public Type getType() {
		return Source.class;
	}
}
