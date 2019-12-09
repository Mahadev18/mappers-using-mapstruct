package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.VehicleLocationDto;
import com.example.mapstruct.models.Location;
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
public class VehicleLocationMapperImpl implements VehicleLocationMapper {

    @Override
    public VehicleLocationDto vehicleLocationToDto(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleLocationDto vehicleLocationDto = new VehicleLocationDto();

        vehicleLocationDto.setLocation_name( vehicleLocationLocation_name( vehicle ) );
        vehicleLocationDto.setLocation_id( vehicleLocationLocation_id( vehicle ) );
        vehicleLocationDto.setVehicle_id( vehicle.getVehicle_id() );
        vehicleLocationDto.setVehicle_model( vehicle.getVehicle_model() );

        return vehicleLocationDto;
    }

    @Override
    public List<VehicleLocationDto> vehicleToVehicleLocationDto(List<Vehicle> vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        List<VehicleLocationDto> list = new ArrayList<VehicleLocationDto>( vehicle.size() );
        for ( Vehicle vehicle1 : vehicle ) {
            list.add( vehicleLocationToDto( vehicle1 ) );
        }

        return list;
    }

    private String vehicleLocationLocation_name(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }
        Location location = vehicle.getLocation();
        if ( location == null ) {
            return null;
        }
        String location_name = location.getLocation_name();
        if ( location_name == null ) {
            return null;
        }
        return location_name;
    }

    private int vehicleLocationLocation_id(Vehicle vehicle) {
        if ( vehicle == null ) {
            return 0;
        }
        Location location = vehicle.getLocation();
        if ( location == null ) {
            return 0;
        }
        int location_id = location.getLocation_id();
        return location_id;
    }
}
