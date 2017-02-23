package com.zeus.api.sellf.response;

import java.lang.reflect.Type;

import com.zeus.api.sellf.model.AppointmentCompany;

public class GetAppointmentCompanyResponse extends GetUniqueResponse<AppointmentCompany> {

	public Type getType() {
		return AppointmentCompany.class;
	}
}
