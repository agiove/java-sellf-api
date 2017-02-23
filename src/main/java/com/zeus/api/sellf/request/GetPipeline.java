package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Pipeline;
import com.zeus.api.sellf.response.GetPipelineResponse;

/**
 * The Pipelines API gives you access to your team’s pipelines, in read-only mode. You can retrieve a single pipeline as well as list of all pipelines associated with your team.
 * Sales pipelines consist of a sequence of Stages in which the deals can be placed. 
 * This endpoint retrieves a specific pipeline according to the ID provided.
 */
public class GetPipeline extends GetUniqueRequest<GetPipelineResponse, Pipeline> {

	private static final String entity = "pipelines/:id";
	
	public GetPipeline(long id) {
		super(entity, id, GetPipelineResponse.class);
	}
}
