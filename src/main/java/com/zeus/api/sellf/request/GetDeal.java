package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.response.GetDealResponse;

/**
 * The Deals API allows you to get, create, update and delete your deals.
 * This endpoint retrieves a specific deal.
 */
public class GetDeal extends GetUniqueRequest<GetDealResponse, Deal> {

	private static final String entity = "deals/:id";
	
	public GetDeal(long id) {
		super(entity, id, GetDealResponse.class);
	}
}
