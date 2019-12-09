package com.example.mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.mapstruct.dto.VehicleDto;
import com.example.mapstruct.dto.VehicleLocationDto;
import com.example.mapstruct.models.Vehicle;
import com.example.mapstruct.sercice.VehicleService;

@RestController
public class VehicleController {
	
	@Autowired
	public VehicleService vehicleservice;
	
	@RequestMapping("/vehicle")
	public List<VehicleDto> getVehicle()
	{
		return vehicleservice.getVehicle();
	}
	
	@RequestMapping("/vehicle/locations")
	public List<VehicleLocationDto> getVehicleLocation()
	{
		return vehicleservice.getVehicleLocation();
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/vehicle")
	public void addVehicle(@RequestBody Vehicle vehicle)
	{
		vehicleservice.addVehicle(vehicle);
	}

	
	@RequestMapping(method = RequestMethod.PUT,value = "vehicle/{vehicle_id}")
	public void updateVehicle(@RequestBody Vehicle vehicle,@PathVariable int vehicle_id)
	{
		vehicleservice.updateVehicle(vehicle,vehicle_id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "vehicle/{vehicle_id}")
	public void deleteVehicle(@PathVariable int vehicle_id)
	{
		vehicleservice.deleteVehicle(vehicle_id);
	}
	
}
