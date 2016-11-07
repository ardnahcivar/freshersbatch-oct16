package com.hibernate.perClass;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
	
@Entity
@Table(name ="Vehicle")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Vehicle {

	@Id
	@GeneratedValue
	@Column(name = "vehicleNo")
	private  int veh_no;
	
	@Column(name="Colour")	
	private  String colour;

	public Vehicle(String colour) {
		this.colour = colour;
	}

	public int getVeh_no() {
		return veh_no;
	}

	public void setVeh_no(int veh_no) {
		this.veh_no = veh_no;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}


	public String toString() {
		return "Vehicle [veh_no=" + veh_no + ", colour=" + colour + "]";
	}
	
	
	
	
	
	
	
}
