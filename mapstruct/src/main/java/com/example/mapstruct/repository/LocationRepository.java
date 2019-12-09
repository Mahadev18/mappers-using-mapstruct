package com.example.mapstruct.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.mapstruct.models.Location;

public interface LocationRepository extends CrudRepository<Location,Integer> {

}
