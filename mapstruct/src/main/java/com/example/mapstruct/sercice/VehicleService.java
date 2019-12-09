package com.example.mapstruct.sercice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.mapstruct.dto.VehicleDto;
import com.example.mapstruct.dto.VehicleLocationDto;
import com.example.mapstruct.mapper.VehicleLocationMapper;
import com.example.mapstruct.mapper.VehicleMapper;
import com.example.mapstruct.models.Vehicle;
import com.example.mapstruct.repository.VehicleRepository;

@Service
public class VehicleService {
	
	@Autowired
	private VehicleRepository vehiclerepository;
	
	@Autowired
	private VehicleMapper vehicleMapper;
	
	@Autowired
	private VehicleLocationMapper vehiclelocationmapper;

	public void addVehicle(Vehicle vehicle) {
		vehiclerepository.save(vehicle);
	}

	public void updateVehicle(Vehicle vehicle, int vehicle_id) {
	vehiclerepository.save(vehicle);
		
	}

	public void deleteVehicle(int vehicle_id) {
		vehiclerepository.deleteById(vehicle_id);
		
	}

	public List<VehicleDto> getVehicle() {
		List<Vehicle> vehicles =  (List<Vehicle>) vehiclerepository.findAll();
		
		List<VehicleDto> vehicleDTO = vehicleMapper.vehicleToDto(vehicles);
		
		return vehicleDTO;
		
		
	}

	public List<VehicleLocationDto> getVehicleLocation() {
		List<Vehicle> vehicles = (List<Vehicle>) vehiclerepository.findAll();
		
		return vehiclelocationmapper.vehicleToVehicleLocationDto(vehicles);
	}

}
