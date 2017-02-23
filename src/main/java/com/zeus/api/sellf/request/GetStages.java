package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Stage;
import com.zeus.api.sellf.response.GetStagesResponse;

/** 
 * The Stages API gives you access to your team’s stages, in read-only mode. You can retrieve a single stage as well as list of all stages associated with your team.
 * Sales stages are related to a specific pipeline and you can associate any number of Deals.
 * This endpoint retrieves all stages of all pipelines. If you want to get the stages of a specific pipeline, you need to specify the pipeline_id as query param.
 */
public class GetStages extends GetListRequest<GetStagesResponse, Stage> {

	private static final String entity = "stages";
	
	private long pipelineId = -1;
	private int type = -1;
	
	public GetStages() {
		super(entity, GetStagesResponse.class);
	}
	
	/** Unique identifier of the pipeline to which stages belongs */
	public GetStages byPipeline(long pipelineId) {
		this.pipelineId = pipelineId;
		return this;
	}
	
	/** Unique identifier of stage type (i.e. 0, 1, 2, 3) */
	public GetStages byType(int type) {
		this.type = type;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(pipelineId > 0){
			params.put("pipeline_id", pipelineId);
		}
		if(type > 0){
			params.put("type", type);
		}
		return params;
	}
}
