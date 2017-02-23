package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.Appointment;

public class GetAppointmentResponse extends GetUniqueResponse<Appointment> {

	public Type getType() {
		return Appointment.class;
	}
}
