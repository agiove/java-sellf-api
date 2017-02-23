package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentPerson;
import com.zeus.api.sellf.response.GetAppointmentPeopleResponse;

/**
 * The Appointment People API allows you to get, add or remove people associated to your appointments.
 * This endpoint retrieves all appointment’s people.
 */
public class GetAppointmentPeople extends GetListRequest<GetAppointmentPeopleResponse, AppointmentPerson> {

	private static final String entity = "appointments/:appointment_id/people";
	
	public GetAppointmentPeople(long appointmentId) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), GetAppointmentPeopleResponse.class);
	}
}

