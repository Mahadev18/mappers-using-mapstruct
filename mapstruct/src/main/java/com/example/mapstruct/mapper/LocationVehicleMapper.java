package com.example.mapstruct.mapper;

import org.mapstruct.Mapper;

import com.example.mapstruct.dto.LocationVehicleDto;
import com.example.mapstruct.models.Location;



@Mapper(componentModel = "spring")
public interface LocationVehicleMapper {

	LocationVehicleDto LocationVehicleToDto(Location location);

}
