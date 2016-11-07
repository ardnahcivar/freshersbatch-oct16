package com.hibernate.perClass;


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Bike")
@AttributeOverrides({
	@AttributeOverride(name="vehicleNo",column=@Column(name ="Bike No")),
	@AttributeOverride(name="Colour",column=@Column(name ="Bikes Colour"))
})
public class Bike extends Vehicle {
	
	@Column(name="Bike name")
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
