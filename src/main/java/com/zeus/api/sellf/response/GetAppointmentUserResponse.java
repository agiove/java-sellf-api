package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.AppointmentUser;

public class GetAppointmentUserResponse extends GetUniqueResponse<AppointmentUser> {

	public Type getType() {
		return AppointmentUser.class;
	}
}
