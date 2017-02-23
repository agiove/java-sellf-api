package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.response.GetCompanyResponse;

public class UpdateCompany extends PutUniqueRequest<GetCompanyResponse, Company> {

	private static final String entity = "companies/:id";
	
	public UpdateCompany(Company data) {
		super(entity, data.getId(), data, GetCompanyResponse.class);
	}
}
