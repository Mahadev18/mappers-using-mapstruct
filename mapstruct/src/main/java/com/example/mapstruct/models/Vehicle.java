package com.example.mapstruct.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private int vehicle_id;           
	@Column
    private String vehicle_model;         
	@Column
    private int fuelCapacity;            
	@Column
    private int length;           
	@Column
    private int breadth;           
	@Column
    private int height;
    
    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;
   
	public Vehicle() {
		super();
	}

	public Vehicle(int vehicle_id, String vehicle_model, int fuelCapacity, int length, int breadth, int height) {
		super();
		this.vehicle_id = vehicle_id;
		this.vehicle_model = vehicle_model;
		this.fuelCapacity = fuelCapacity;
		this.length = length;
		this.breadth = breadth;
		this.height = height;
	}

	public int getVehicle_id() {
		return vehicle_id;
	}

	public void setVehicle_id(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}

	public String getVehicle_model() {
		return vehicle_model;
	}

	public void setVehicle_model(String vehicle_model) {
		this.vehicle_model = vehicle_model;
	}

	public int getFuelCapacity() {
		return fuelCapacity;
	}

	public void setFuelCapacity(int fuelCapacity) {
		this.fuelCapacity = fuelCapacity;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

}
