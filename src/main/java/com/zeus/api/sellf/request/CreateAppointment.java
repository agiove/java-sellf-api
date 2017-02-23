package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Appointment;
import com.zeus.api.sellf.response.GetAppointmentResponse;

/**
 * The Appointments API allows you to get, create, update and delete your appointments. Each appointment can be associated to one or more Companies, one or more People, one or more Users and one Deal.
 * This endpoint allows to create an appointment.
 */
public class CreateAppointment extends PostUniqueRequest<GetAppointmentResponse, Appointment> {

	private static final String entity = "appointments";
	
	public CreateAppointment(Appointment data) {
		super(entity, data, GetAppointmentResponse.class);
	}
}
