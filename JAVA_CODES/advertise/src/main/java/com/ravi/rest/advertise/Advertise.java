package com.ravi.rest.advertise;

public class Advertise {
	private String name;
	private String category;
	private String description;
	
	public Advertise(String name, String category, String description) {
		this.name = name;
		this.category = category;
		this.description = description;
	}
	
	public Advertise() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Advertise [name=" + name + ", category=" + category + ", description=" + description + "]";
	}
	
	
	
	
}
