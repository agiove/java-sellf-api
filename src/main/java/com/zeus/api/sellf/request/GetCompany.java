package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.response.GetCompanyResponse;

public class GetCompany extends GetUniqueRequest<GetCompanyResponse, Company> {

	private static final String entity = "companies/:id";
	
	public GetCompany(long id) {
		super(entity, id, GetCompanyResponse.class);
	}
}
