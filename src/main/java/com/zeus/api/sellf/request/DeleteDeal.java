package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.response.DeleteResponse;

/**
 * The Deals API allows you to get, create, update and delete your deals.
 * This endpoint deletes a specific deal. Deleting a deal implies that even all the associated entities are deleted, except for people and companies.
 */
public class DeleteDeal extends DeleteUniqueRequest<DeleteResponse, Deal> {

	private static final String entity = "deals/:id";
	
	public DeleteDeal(long id) {
		super(entity, id, DeleteResponse.class);
	}
}
