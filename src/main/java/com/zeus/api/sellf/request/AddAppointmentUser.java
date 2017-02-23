package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentUser;
import com.zeus.api.sellf.response.GetAppointmentUserResponse;

/**
 * The Appointment Users API allows you to get, add or remove users associated to your appointments. A user is a guest, that is, the appointments in which it is invited are shown in its calendar.
 * This endpoint allows to associate a user to an appointment.
 */
public class AddAppointmentUser extends PostUniqueRequest<GetAppointmentUserResponse, AppointmentUser> {

	private static final String entity = "appointments/:appointment_id/users";
	
	public AddAppointmentUser(long appointmentId, AppointmentUser data) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), data, GetAppointmentUserResponse.class);
	}

}
