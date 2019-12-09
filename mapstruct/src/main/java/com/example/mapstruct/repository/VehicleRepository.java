package com.example.mapstruct.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mapstruct.models.Vehicle;



public interface VehicleRepository extends CrudRepository<Vehicle,Integer>{

}
