package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Person;

public class GetPersonResponse extends GetUniqueResponse<Person> {

	@Override
	public Type getType() {
		return Person.class;
	}

}
