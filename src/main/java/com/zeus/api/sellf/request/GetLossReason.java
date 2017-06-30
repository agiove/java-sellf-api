package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.LossReason;
import com.zeus.api.sellf.response.GetLossReasonResponse;

/**
 * The Loss Reasons API gives you access to your team’s loss reasons, in read-only mode. You can retrieve a single loss reason as well as list of all loss reasons associated with your team.
 * This endpoint retrieves a specific loss reason according to the ID provided.
 */
public class GetLossReason extends GetUniqueRequest<GetLossReasonResponse, LossReason> {

	private static final String entity = "loss_reasons/:id";
	
	public GetLossReason(long id) {
		super(entity, id, GetLossReasonResponse.class);
	}
}
