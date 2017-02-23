package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.response.GetDealResponse;

/**
 * The Deals API allows you to get, create, update and delete your deals.
 * This endpoint allows to update a specific deal.
 */
public class UpdateDeal extends PutUniqueRequest<GetDealResponse, Deal> {

	private static final String entity = "deals/:id";
	
	public UpdateDeal(Deal data) {
		super(entity, data.getId(), data, GetDealResponse.class);
	}
}
