package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.User;

public class GetUserResponse extends GetUniqueResponse<User> {

	public Type getType() {
		return User.class;
	}
}
