package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.model.Note;
import com.zeus.api.sellf.model.Person;
import com.zeus.api.sellf.model.User;
import com.zeus.api.sellf.response.GetNotesResponse;

/**
 * The Notes API allows you to get, create, update and delete your notes. Each note can be associated to one {@link Company}, one {@link Person}, one {@link User} and one {@link Deal}.
 * This endpoint retrieves all notes.
 */
public class GetNotes extends GetListRequest<GetNotesResponse, Note> {

	private static final String entity = "notes";
	
	private long ownerId = -1;
	private long personId = -1;
	private long companyId = -1;
	private long dealId = -1;
	private String title = null;
	
	public GetNotes() {
		super(entity, GetNotesResponse.class);
	}
	
	/** Unique identifier of the user the note is owned by */
	public GetNotes byOwner(long userId) {
		this.ownerId = userId;
		return this;
	}
	
	/** Unique identifier of the person with whom the note is associated */
	public GetNotes byPerson(long personId) {
		this.personId = personId;
		return this;
	}
	
	/** Unique identifier of the company with whom the note is associated */
	public GetNotes byCompany(long companyId) {
		this.companyId = companyId;
		return this;
	}
	
	/** Unique identifier of the deal with whom the note is associated */
	public GetNotes byDeal(long dealId) {
		this.dealId = dealId;
		return this;
	}
	
	/** A string containing or matching the title of the note */
	public GetNotes byTitle(String title) {
		this.title = title;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(ownerId > 0){
			params.put("user_id", ownerId);
		}
		if(personId > 0){
			params.put("person_id", personId);
		}
		if(companyId > 0){
			params.put("company_id", companyId);
		}
		if(dealId > 0){
			params.put("deal_id", dealId);
		}
		if(title != null && !title.isEmpty()){
			params.put("title", title);
		}
		return params;
	}
}
