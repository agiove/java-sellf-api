package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.response.GetCompanyResponse;

public class CreateCompany extends PostUniqueRequest<GetCompanyResponse, Company> {

	private static final String entity = "companies";
	
	public CreateCompany(Company data) {
		super(entity, data, GetCompanyResponse.class);
	}
}
