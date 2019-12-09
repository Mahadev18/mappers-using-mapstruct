package com.example.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;


import com.example.mapstruct.dto.VehicleDto;
import com.example.mapstruct.models.Vehicle;

@Mapper(componentModel = "spring")
public interface VehicleMapper {
	
	
	VehicleDto vehicleToDto(Vehicle vehicle);
	
	List<VehicleDto> vehicleToDto(List<Vehicle> vehicles);
	
}
