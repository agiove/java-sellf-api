package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Stage;

public class GetStageResponse extends GetUniqueResponse<Stage> {

	public Type getType() {
		return Stage.class;
	}
}
