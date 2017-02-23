package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Stage;
import com.zeus.api.sellf.response.GetStageResponse;

/** 
 * The Stages API gives you access to your team’s stages, in read-only mode. You can retrieve a single stage as well as list of all stages associated with your team.
 * Sales stages are related to a specific pipeline and you can associate any number of Deals.
 * This endpoint retrieves a specific stage according to the ID provided.
 */
public class GetStage extends GetUniqueRequest<GetStageResponse, Stage> {

	private static final String entity = "stages/:id";
	
	public GetStage(long id) {
		super(entity, id, GetStageResponse.class);
	}
}
