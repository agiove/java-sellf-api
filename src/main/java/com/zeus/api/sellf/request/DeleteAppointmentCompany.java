package com.zeus.api.sellf.request;

import com.zeus.api.sellf.model.AppointmentCompany;
import com.zeus.api.sellf.response.DeleteResponse;

/**
 * The Appointment Companies API allows you to get, add or remove companies associated to your appointments.
 * This endpoint removes the association of a company with an appointment.
 */
public class DeleteAppointmentCompany extends DeleteUniqueRequest<DeleteResponse, AppointmentCompany> {

	private static final String entity = "appointments/:appointment_id/companies/:id";
	
	public DeleteAppointmentCompany(long appointmentId, long companyId) {
		super(entity.replaceAll(":appointment_id", String.valueOf(appointmentId)), companyId, DeleteResponse.class);
	}
}
