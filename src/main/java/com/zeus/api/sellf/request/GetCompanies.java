package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.response.GetCompaniesResponse;

public class GetCompanies extends GetListRequest<GetCompaniesResponse, Company> {

	private static final String entity = "companies";
	
	private long ownerId = -1;
	private String name = null;
	
	public GetCompanies() {
		super(entity, GetCompaniesResponse.class);
	}
	
	/** Unique identifier of the user the company is owned by */
	public GetCompanies byOwner(long userId) {
		this.ownerId = userId;
		return this;
	}
	
	public GetCompanies byName(String name) {
		this.name = name;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(ownerId > 0){
			params.put("user_id", ownerId);
		}
		if(name != null){
			params.put("name", name);
		}
		return params;
	}
}
