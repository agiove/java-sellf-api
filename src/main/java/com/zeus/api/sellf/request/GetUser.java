package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.User;
import com.zeus.api.sellf.response.GetUserResponse;

/**
 * The Users API gives you access to your team’s users, in read-only mode. You can retrieve a single user as well as list of all users associated with your team.
 * This endpoint retrieves a specific user according to the ID provided.
 */
public class GetUser extends GetUniqueRequest<GetUserResponse, User> {

	private static final String entity = "users/:id";
	
	public GetUser(long id) {
		super(entity, id, GetUserResponse.class);
	}

	@Override
	public String urlPart() {
		return super.urlPart();
	}

}
