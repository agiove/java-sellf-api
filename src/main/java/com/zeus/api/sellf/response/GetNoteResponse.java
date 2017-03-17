package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Note;

public class GetNoteResponse extends GetUniqueResponse<Note> {

	@Override
	public Type getType() {
		return Note.class;
	}

}
