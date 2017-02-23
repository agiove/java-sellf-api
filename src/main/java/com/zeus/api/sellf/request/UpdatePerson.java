package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Person;
import com.zeus.api.sellf.response.GetPersonResponse;

/**
 * The People API allows you to get, create, update and delete your people. Each person can be associated to a {@link Company} and one or more {@link Deal}s.
 * This endpoint allows to update a specific person.
 */
public class UpdatePerson extends PutUniqueRequest<GetPersonResponse, Person> {

	private static final String entity = "people/:id";
	
	public UpdatePerson(Person data) {
		super(entity, data.getId(), data, GetPersonResponse.class);
	}
}
