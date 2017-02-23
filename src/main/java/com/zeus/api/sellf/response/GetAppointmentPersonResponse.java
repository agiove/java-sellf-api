package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.AppointmentPerson;

public class GetAppointmentPersonResponse extends GetUniqueResponse<AppointmentPerson> {

	public Type getType() {
		return AppointmentPerson.class;
	}
}
