package com.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "cid")
	private int cid;
	
	@Column(name = "cust_name")
	private String cust_name;

	public Customer(String cust_name) {
	
		this.cust_name = cust_name;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cust_name=" + cust_name + "]";
	}
	
	
	
	
	

}
