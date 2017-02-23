package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentCompany;
import com.zeus.api.sellf.response.GetAppointmentCompanyResponse;

/**
 * The Appointment Companies API allows you to get, add or remove companies associated to your appointments.
 * This endpoint allows to associate a company to an appointment.
 */
public class AddAppointmentCompany extends PostUniqueRequest<GetAppointmentCompanyResponse, AppointmentCompany> {

	private static final String entity = "appointments/:appointment_id/companies";
	
	public AddAppointmentCompany(long appointmentId, AppointmentCompany data) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), data, GetAppointmentCompanyResponse.class);
	}

}
