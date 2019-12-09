package com.example.mapstruct.mapper;

import com.example.mapstruct.dto.LocationVehicleDto;
import com.example.mapstruct.dto.VehicleDto;
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
public class LocationVehicleMapperImpl implements LocationVehicleMapper {

    @Override
    public LocationVehicleDto LocationVehicleToDto(Location location) {
        if ( location == null ) {
            return null;
        }

        LocationVehicleDto locationVehicleDto = new LocationVehicleDto();

        locationVehicleDto.setLocation_id( location.getLocation_id() );
        locationVehicleDto.setLocation_name( location.getLocation_name() );
        locationVehicleDto.setAddress( location.getAddress() );
        locationVehicleDto.vehicle = vehicleListToVehicleDtoList( location.vehicle );

        return locationVehicleDto;
    }

    protected VehicleDto vehicleToVehicleDto(Vehicle vehicle) {
        if ( vehicle == null ) {
            return null;
        }

        VehicleDto vehicleDto = new VehicleDto();

        vehicleDto.setVehicle_id( vehicle.getVehicle_id() );
        vehicleDto.setVehicle_model( vehicle.getVehicle_model() );
        vehicleDto.setFuelCapacity( vehicle.getFuelCapacity() );

        return vehicleDto;
    }

    protected List<VehicleDto> vehicleListToVehicleDtoList(List<Vehicle> list) {
        if ( list == null ) {
            return null;
        }

        List<VehicleDto> list1 = new ArrayList<VehicleDto>( list.size() );
        for ( Vehicle vehicle : list ) {
            list1.add( vehicleToVehicleDto( vehicle ) );
        }

        return list1;
    }
}
