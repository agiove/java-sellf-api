package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Product;

public class GetProductResponse extends GetUniqueResponse<Product> {

	public Type getType() {
		return Product.class;
	}
}
