package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.response.DeleteResponse;

public class DeleteCompany extends DeleteUniqueRequest<DeleteResponse, Company> {

	private static final String entity = "companies/:id";
	
	public DeleteCompany(long id) {
		super(entity, id, DeleteResponse.class);
	}
}
