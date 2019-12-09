package com.example.mapstruct.dto;

import java.util.List;

public class LocationVehicleDto {

	public int location_id;
	public String location_name;
	public String address;
	
	public List<VehicleDto> vehicle;

	public LocationVehicleDto() {
		super();
	}

	public int getLocation_id() {
		return location_id;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public String getLocation_name() {
		return location_name;
	}

	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<VehicleDto> getVehicledto() {
		return vehicle;
	}

	public void setVehicledto(List<VehicleDto> vehicledto) {
		this.vehicle = vehicledto;
	}
	
}
