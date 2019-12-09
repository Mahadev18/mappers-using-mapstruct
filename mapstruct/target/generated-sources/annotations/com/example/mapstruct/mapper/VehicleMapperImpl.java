package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.VehicleDto;
import com.example.mapstruct.models.Vehicle;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2019-12-09T15:11:38+0530",
    comments = "version: 1.3.0.Final, compiler: javac, environment: Java 10.0.2 (Oracle Corporation)"
)
@Component
public class VehicleMapperImpl implements VehicleMapper {

    @Override
    public VehicleDto vehicleToDto(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleDto vehicleDto = new VehicleDto();

        vehicleDto.setVehicle_id( vehicle.getVehicle_id() );
        vehicleDto.setVehicle_model( vehicle.getVehicle_model() );
        vehicleDto.setFuelCapacity( vehicle.getFuelCapacity() );

        return vehicleDto;
    }

    @Override
    public List<VehicleDto> vehicleToDto(List<Vehicle> vehicles) {
        if ( vehicles == null ) {
            return null;
        }

        List<VehicleDto> list = new ArrayList<VehicleDto>( vehicles.size() );
        for ( Vehicle vehicle : vehicles ) {
            list.add( vehicleToDto( vehicle ) );
        }

        return list;
    }
}
