package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.response.GetDealsResponse;

/**
 * The Deals API allows you to get, create, update and delete your deals.
 * This endpoint retrieves all deals.
 */
public class GetDeals extends GetListRequest<GetDealsResponse, Deal> {

	private static final String entity = "deals";
	
	private long ownerId = -1;
	private long stageId = -1;
	private long contactId = -1;
	private long companyId = -1;
	private long sourceId = -1;
	private long productId = -1;
	
	public GetDeals() {
		super(entity, GetDealsResponse.class);
	}
	
	/** Unique identifier of the user the deal is owned by */
	public GetDeals byOwner(long userId) {
		this.ownerId = userId;
		return this;
	}
	
	/** Unique identifier of the stage in which the deal is placed */
	public GetDeals byStage(long stageId) {
		this.stageId = stageId;
		return this;
	}
	
	/** Unique identifier of the main deal with whom the deal is associated */
	public GetDeals byContact(long contactId) {
		this.contactId = contactId;
		return this;
	}
	
	/** Unique identifier of the main company with whom the deal is associated */
	public GetDeals byCompany(long companyId) {
		this.companyId = companyId;
		return this;
	}
	
	/** Unique identifier of the deal source */
	public GetDeals bySource(long sourceId) {
		this.sourceId = sourceId;
		return this;
	}
	
	/** Unique identifier of the product related to the deal */
	public GetDeals byProduct(long productId) {
		this.productId = productId;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(ownerId > 0){
			params.put("user_id", ownerId);
		}
		if(stageId > 0){
			params.put("stage_id", stageId);
		}
		if(contactId > 0){
			params.put("contact_id", contactId);
		}
		if(companyId > 0){
			params.put("company_id", companyId);
		}
		if(sourceId > 0){
			params.put("source_id", sourceId);
		}
		if(productId > 0){
			params.put("product_id", productId);
		}
		return params;
	}
}
