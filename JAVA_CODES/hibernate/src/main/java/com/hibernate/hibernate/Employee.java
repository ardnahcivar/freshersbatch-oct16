package com.hibernate.hibernate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


@NamedQueries({
	@NamedQuery(name="getAllEmployees",
			query="from Employee"),
	
	@NamedQuery(name = "orderBySalary",
			query = "from Employee E   where E.salary > 5000"),
	@NamedQuery(name = "Distinct Records",
	query = "select distinct name from Employee")
})
@Entity
@Table(name="Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="eid")
	private int id;
	
	@Column(name="name")
	private String name;

	@Column(name="salary")
	private double salary;
	
	@Column(name = "City")
	private String city;
	
	public Employee() {
	}
	public Employee(String name, double salary,String city) {
		//this.id = id;
		this.name = name;
		this.salary = salary;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setPrice(double salary) {
		this.salary = salary ;
	}
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString() {
		return id + " - " + name + " - " + salary+" -"+city;
	}
}
