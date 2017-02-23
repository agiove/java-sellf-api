package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Source;
import com.zeus.api.sellf.response.GetSourceResponse;

/**
 * The Sources API gives you access to your team’s sources, in read-only mode. You can retrieve a single source as well as list of all sources associated with your team.
 * Sources can be associated with any number of Deals.
 * This endpoint retrieves a specific source according to the ID provided.
 */
public class GetSource extends GetUniqueRequest<GetSourceResponse, Source> {

	private static final String entity = "sources/:id";
	
	public GetSource(long id) {
		super(entity, id, GetSourceResponse.class);
	}
}
