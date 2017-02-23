package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Source;
import com.zeus.api.sellf.response.GetSourcesResponse;

/**
 * The Sources API gives you access to your team’s sources, in read-only mode. You can retrieve a single source as well as list of all sources associated with your team.
 * Sources can be associated with any number of Deals.
 * This endpoint retrieves all deals’ sources.
 */
public class GetSources extends GetListRequest<GetSourcesResponse, Source> {

	private static final String entity = "sources";
	
	public GetSources() {
		super(entity, GetSourcesResponse.class);
	}
}
