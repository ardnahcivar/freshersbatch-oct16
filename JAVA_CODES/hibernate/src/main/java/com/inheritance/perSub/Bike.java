package com.inheritance.perSub;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
@PrimaryKeyJoinColumn(name ="vehicleNo")
public class Bike extends Vehicle {
	
	@Column
	private String bike_name;

	public Bike(String color,String bike_name) {
		super(color);
		this.bike_name = bike_name;
	}

	public String getBike_name() {
		return bike_name;
	}

	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}

	public String toString() {
		return "Bike [bike_name=" + bike_name + "]";
	}
	
	
	
	
	

}
