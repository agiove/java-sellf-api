package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentPerson;
import com.zeus.api.sellf.response.GetAppointmentPersonResponse;

/**
 * The Appointment People API allows you to get, add or remove people associated to your appointments.
 * This endpoint allows to associate a person to an appointment.
 */
public class AddAppointmentPerson extends PostUniqueRequest<GetAppointmentPersonResponse, AppointmentPerson> {

	private static final String entity = "appointments/:appointment_id/people";
	
	public AddAppointmentPerson(long appointmentId, AppointmentPerson data) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), data, GetAppointmentPersonResponse.class);
	}

}
