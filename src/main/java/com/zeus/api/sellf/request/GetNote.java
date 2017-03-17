package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Company;
import com.zeus.api.sellf.model.Deal;
import com.zeus.api.sellf.model.Note;
import com.zeus.api.sellf.model.Person;
import com.zeus.api.sellf.model.User;
import com.zeus.api.sellf.response.GetNoteResponse;

/**
 * The Notes API allows you to get, create, update and delete your notes. Each note can be associated to one {@link Company}, one {@link Person}, one {@link User} and one {@link Deal}.
 * This endpoint retrieves a specific note.
 */
public class GetNote extends GetUniqueRequest<GetNoteResponse, Note> {

	private static final String entity = "notes/:id";
	
	public GetNote(long id) {
		super(entity, id, GetNoteResponse.class);
	}
}
