package com.inheritance.perSub;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name ="Car")
@PrimaryKeyJoinColumn(name="vehicleNo")
public class Car extends Vehicle{

	@Column
	private String car_name;

	public Car(String colour,String car_name) {
		super(colour);
		this.car_name = car_name;
	}

	public String getCar_name() {
		return car_name;
	}

	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}


	public String toString() {
		return "Car [car_name=" + car_name + "]";
	}

	
	
	

}
