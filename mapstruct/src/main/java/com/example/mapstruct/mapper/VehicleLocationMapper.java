package com.example.mapstruct.mapper;
							
import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


import com.example.mapstruct.dto.VehicleLocationDto;
import com.example.mapstruct.models.Vehicle;

@Mapper(componentModel = "spring")
public interface VehicleLocationMapper {

	@Mapping(source = "location.location_id", target  = "location_id")
	@Mapping(source = "location.location_name",target = "location_name")
	VehicleLocationDto vehicleLocationToDto(Vehicle vehicle);
	
	List<VehicleLocationDto> vehicleToVehicleLocationDto(List<Vehicle> vehicle);
}
