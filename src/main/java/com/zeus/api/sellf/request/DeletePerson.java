package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Person;
import com.zeus.api.sellf.response.DeleteResponse;

/**
 * The People API allows you to get, create, update and delete your people. Each person can be associated to a {@link Company} and one or more {@link Deal}s.
 * This endpoint deletes a specific person. Deleting a person implies that even all the associated entities are deleted, except for the associated company.
 */
public class DeletePerson extends DeleteUniqueRequest<DeleteResponse, Person> {

	private static final String entity = "people/:id";
	
	public DeletePerson(long id) {
		super(entity, id, DeleteResponse.class);
	}
}
