package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentUser;
import com.zeus.api.sellf.response.GetAppointmentUsersResponse;

/**
 * The Appointment Users API allows you to get, add or remove users associated to your appointments. A user is a guest, that is, the appointments in which it is invited are shown in its calendar.
 * This endpoint retrieves all appointment’s users.
 */
public class GetAppointmentUsers extends GetListRequest<GetAppointmentUsersResponse, AppointmentUser> {

	private static final String entity = "appointments/:appointment_id/users";
	
	public GetAppointmentUsers(long appointmentId) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), GetAppointmentUsersResponse.class);
	}
}

