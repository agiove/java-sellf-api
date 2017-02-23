package com.zeus.api.sellf.request;

import java.util.Map;

import com.zeus.api.sellf.model.Appointment;
import com.zeus.api.sellf.response.GetAppointmentsResponse;

/**
 * The Appointments API allows you to get, create, update and delete your appointments. Each appointment can be associated to one or more Companies, one or more People, one or more Users and one Deal.
 * This endpoint retrieves all appointments.
 */
public class GetAppointments extends GetListRequest<GetAppointmentsResponse, Appointment> {

	private static final String entity = "appointments";
	
	private long ownerId = -1;
	private String name = null;
	private long dealId = -1;
	
	public GetAppointments() {
		super(entity, GetAppointmentsResponse.class);
	}
	
	/** Unique identifier of the user the appointment is owned by */
	public GetAppointments byOwner(long userId) {
		this.ownerId = userId;
		return this;
	}
	
	/** A string containing or matching the name of the appointment */
	public GetAppointments byName(String name) {
		this.name = name;
		return this;
	}
	
	/** Unique identifier of the deal with whom the appointment is associated */
	public GetAppointments byDeal(long dealId) {
		this.dealId = dealId;
		return this;
	}
	
	public Map<String, Object> params() {
		Map<String, Object> params = super.params();
		if(ownerId > 0){
			params.put("user_id", ownerId);
		}
		if(name != null){
			params.put("name", name);
		}
		if(dealId > 0){
			params.put("deal_id", dealId);
		}
		return params;
	}
}
