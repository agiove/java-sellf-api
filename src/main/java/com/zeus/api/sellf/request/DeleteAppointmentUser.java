package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentUser;
import com.zeus.api.sellf.response.DeleteResponse;

/**
 * The Appointment Users API allows you to get, add or remove users associated to your appointments. A user is a guest, that is, the appointments in which it is invited are shown in its calendar.
 * This endpoint removes the association of a user with an appointment.
 */
public class DeleteAppointmentUser extends DeleteUniqueRequest<DeleteResponse, AppointmentUser> {

	private static final String entity = "appointments/:appointment_id/users/:id";
	
	public DeleteAppointmentUser(long appointmentId, long userId) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), userId, DeleteResponse.class);
	}
}
