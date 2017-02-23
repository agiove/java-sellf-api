package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Pipeline;
import com.zeus.api.sellf.response.GetPipelinesResponse;

/**
 * The Pipelines API gives you access to your team’s pipelines, in read-only mode. You can retrieve a single pipeline as well as list of all pipelines associated with your team.
 * Sales pipelines consist of a sequence of Stages in which the deals can be placed. 
 * This endpoint retrieves all pipelines.
 */
public class GetPipelines extends GetListRequest<GetPipelinesResponse, Pipeline> {

	private static final String entity = "pipelines";
	
	private String type = null;
	
	public GetPipelines() {
		super(entity, GetPipelinesResponse.class);
	}
	
	/** Type of pipeline in terms of being monetary or quantitative (i.e. cash, quantity) */
	public GetPipelines byType(String type) {
		this.type = type;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(type != null){
			params.put("type", type);
		}
		return params;
	}
}
