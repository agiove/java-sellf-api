package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.User;
import com.zeus.api.sellf.response.GetUsersResponse;

/**
 * The Users API gives you access to your team’s users, in read-only mode. You can retrieve a single user as well as list of all users associated with your team.
 * This endpoint retrieves all users.
 */
public class GetUsers extends GetListRequest<GetUsersResponse, User> {

	private static final String entity = "users";
	
	public GetUsers() {
		super(entity, GetUsersResponse.class);
	}
}
