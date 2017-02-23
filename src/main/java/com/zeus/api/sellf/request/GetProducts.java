package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Product;
import com.zeus.api.sellf.response.GetProductsResponse;

/**
 * The Products API gives you access to your team’s margins, in read-only mode. You can retrieve a single margin as well as list of all margins associated with your team. Margins are useful when you want to monitor not only the estimated value of a deal but also the profit that is going to be generated when the deal is successfully closed.
 * This endpoint retrieves all products of the team.
 */
public class GetProducts extends GetListRequest<GetProductsResponse, Product> {

	private static final String entity = "products";
	
	public GetProducts() {
		super(entity, GetProductsResponse.class);
	}
}
