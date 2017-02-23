package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentPerson;
import com.zeus.api.sellf.response.DeleteResponse;

/**
 * The Appointment People API allows you to get, add or remove people associated to your appointments.
 * This endpoint removes the association of a person with an appointment.
 */
public class DeleteAppointmentPerson extends DeleteUniqueRequest<DeleteResponse, AppointmentPerson> {

	private static final String entity = "appointments/:appointment_id/people/:id";
	
	public DeleteAppointmentPerson(long appointmentId, long personId) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), personId, DeleteResponse.class);
	}
}
