package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Pipeline;

public class GetPipelineResponse extends GetUniqueResponse<Pipeline> {

	public Type getType() {
		return Pipeline.class;
	}
}
