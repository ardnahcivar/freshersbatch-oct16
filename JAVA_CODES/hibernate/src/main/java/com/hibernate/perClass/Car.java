package com.hibernate.perClass;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name ="Car")
@AttributeOverrides({
	@AttributeOverride(name="vehicleNo",column=@Column(name ="CarNo")),
	@AttributeOverride(name="Colour",column=@Column(name ="Car Colour"))
})

public class Car extends Vehicle{

	@Column(name="Car name")
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
