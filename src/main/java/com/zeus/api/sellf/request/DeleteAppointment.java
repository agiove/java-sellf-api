package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Appointment;
import com.zeus.api.sellf.response.DeleteResponse;

/**
 * The Appointments API allows you to get, create, update and delete your appointments. Each appointment can be associated to one or more Companies, one or more People, one or more Users and one Deal.
 * This endpoint deletes a specific appointment.
 */
public class DeleteAppointment extends DeleteUniqueRequest<DeleteResponse, Appointment> {

	private static final String entity = "appointments/:id";
	
	public DeleteAppointment(long id) {
		super(entity, id, DeleteResponse.class);
	}
}
