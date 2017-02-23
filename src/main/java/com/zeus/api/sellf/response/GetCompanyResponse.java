package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Company;

public class GetCompanyResponse extends GetUniqueResponse<Company> {

	public Type getType() {
		return Company.class;
	}
}
