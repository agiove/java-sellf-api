package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.Appointment;
import com.zeus.api.sellf.response.GetAppointmentResponse;

/**
 * The Appointments API allows you to get, create, update and delete your appointments. Each appointment can be associated to one or more Companies, one or more People, one or more Users and one Deal.
 * This endpoint retrieves a specific appointment.
 */
public class GetAppointment extends GetUniqueRequest<GetAppointmentResponse, Appointment> {

	private static final String entity = "appointments/:id";
	
	public GetAppointment(long id) {
		super(entity, id, GetAppointmentResponse.class);
	}
}
