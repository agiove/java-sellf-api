package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.model.Person;
import com.zeus.api.sellf.response.GetPeopleResponse;

/**
 * The People API allows you to get, create, update and delete your people. Each person can be associated to a {@link Company} and one or more {@link Deal}s.
 * This endpoint retrieves all people.
 */
public class GetPeople extends GetListRequest<GetPeopleResponse, Person> {

	private static final String entity = "people";
	
	private long ownerId = -1;
	private long companyId = -1;
	private String name = null;
	
	public GetPeople() {
		super(entity, GetPeopleResponse.class);
	}
	
	/** Unique identifier of the user the person is owned by */
	public GetPeople byOwner(long userId) {
		this.ownerId = userId;
		return this;
	}
	
	/** Unique identifier of the company with whom the person is associated */
	public GetPeople byCompany(long companyId) {
		this.companyId = companyId;
		return this;
	}
	
	/** A string containing or matching the name of the person */
	public GetPeople byName(String name) {
		this.name = name;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(ownerId > 0){
			params.put("user_id", ownerId);
		}
		if(companyId > 0){
			params.put("company_id", companyId);
		}
		if(name != null){
			params.put("name", name);
		}
		return params;
	}
}
