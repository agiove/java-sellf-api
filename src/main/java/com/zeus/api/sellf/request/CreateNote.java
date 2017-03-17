package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Note;
import com.zeus.api.sellf.response.GetNoteResponse;

/**
 * The Notes API allows you to get, create, update and delete your notes. Each note can be associated to one {@link Company}, one {@link Person}, one {@link User} and one {@link Deal}.
 * This endpoint allows to create a note.
 */
public class CreateNote extends PostUniqueRequest<GetNoteResponse, Note> {

	private static final String entity = "notes";
	
	public CreateNote(Note data) {
		super(entity, data, GetNoteResponse.class);
	}
}
