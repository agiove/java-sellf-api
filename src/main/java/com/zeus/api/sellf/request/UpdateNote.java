package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Note;
import com.zeus.api.sellf.response.GetNoteResponse;

/**
 * The Notes API allows you to get, create, update and delete your notes. Each note can be associated to one {@link Company}, one {@link Person}, one {@link User} and one {@link Deal}.
 * This endpoint allows to update a specific note.
 */
public class UpdateNote extends PutUniqueRequest<GetNoteResponse, Note> {

	private static final String entity = "notes/:id";
	
	public UpdateNote(Note data) {
		super(entity, data.getId(), data, GetNoteResponse.class);
	}
}
