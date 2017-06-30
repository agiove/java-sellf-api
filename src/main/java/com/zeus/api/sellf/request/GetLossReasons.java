package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.LossReason;
import com.zeus.api.sellf.response.GetLossReasonsResponse;

/**
 * The Loss Reasons API gives you access to your team’s loss reasons, in read-only mode. You can retrieve a single loss reason as well as list of all loss reasons associated with your team.
 * This endpoint retrieves all deals’ loss reasons.
 */
public class GetLossReasons extends GetListRequest<GetLossReasonsResponse, LossReason> {

	private static final String entity = "loss_reasons";
	
	public GetLossReasons() {
		super(entity, GetLossReasonsResponse.class);
	}
	
}
