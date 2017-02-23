package com.zeus.api.sellf.response;

import java.util.List;

import com.zeus.api.sellf.BaseResponse;
import com.zeus.api.sellf.model.User;

public class GetUsersResponse extends BaseResponse {

	private List<User> data;
	
	public List<User> list() {
		return data;
	}
}
