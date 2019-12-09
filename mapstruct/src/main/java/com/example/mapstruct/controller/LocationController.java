package com.example.mapstruct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.mapstruct.dto.LocationVehicleDto;
import com.example.mapstruct.models.Location;
import com.example.mapstruct.sercice.LocationService;

@RestController
public class LocationController {

	@Autowired
	private LocationService  locationservice;
	
	
	@RequestMapping("/location/{location_id}")
	public LocationVehicleDto getLocations(@PathVariable int location_id)
	{
		return locationservice.getLocations(location_id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value = "/location")
	public void addLocation(@RequestBody Location location)
	{
		locationservice.addLocation(location);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value = "/location/{location_id}")
	public void updateLocation(@RequestBody Location location, @PathVariable int location_id)
	{
		locationservice.updateLocation(location,location_id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value = "/location/{location_id}")
	public void deleteLocation(@PathVariable int location_id)
	{
		locationservice.deleteLocation(location_id);
	}
}
