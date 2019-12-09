package com.example.mapstruct.sercice;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapstruct.dto.LocationVehicleDto;
import com.example.mapstruct.mapper.LocationVehicleMapper;
import com.example.mapstruct.models.Location;
import com.example.mapstruct.repository.LocationRepository;

@Service
public class LocationService {

	@Autowired
	private LocationRepository locationrepository;

	@Autowired
	private LocationVehicleMapper locationvehiclemapper;

	// add locations
	public void addLocation(Location location) {
		locationrepository.save(location);

	}

	// update locations
	public void updateLocation(Location location, int location_id) {
		locationrepository.save(location);

	}

	// delete locations
	public void deleteLocation(int location_id) {
		locationrepository.deleteById(location_id);

	}

	public LocationVehicleDto getLocations(int location_id) {

		Optional<Location> location = locationrepository.findById(location_id);

		return locationvehiclemapper.LocationVehicleToDto(location.get());
	}

}
