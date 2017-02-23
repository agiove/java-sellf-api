package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentCompany;
import com.zeus.api.sellf.response.GetAppointmentCompaniesResponse;

/**
 * The Appointment Companies API allows you to get, add or remove companies associated to your appointments.
 * This endpoint retrieves all appointment’s companies.
 */
public class GetAppointmentCompanies extends GetListRequest<GetAppointmentCompaniesResponse, AppointmentCompany> {

	private static final String entity = "appointments/:appointment_id/companies";
	
	public GetAppointmentCompanies(long appointmentId) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), GetAppointmentCompaniesResponse.class);
	}
}

