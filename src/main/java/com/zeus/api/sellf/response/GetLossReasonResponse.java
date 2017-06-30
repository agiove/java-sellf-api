package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.LossReason;

public class GetLossReasonResponse extends GetUniqueResponse<LossReason> {

	@Override
	public Type getType() {
		return LossReason.class;
	}

}
