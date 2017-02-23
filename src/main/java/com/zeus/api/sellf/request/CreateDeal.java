package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.response.GetDealResponse;

/**
 * The Deals API allows you to get, create, update and delete your deals.
 * This endpoint allows to create a deal.
 */
public class CreateDeal extends PostUniqueRequest<GetDealResponse, Deal> {

	private static final String entity = "deals";
	
	public CreateDeal(Deal data) {
		super(entity, data, GetDealResponse.class);
	}
}
