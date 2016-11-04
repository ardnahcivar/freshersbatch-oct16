package com.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "Enquiry")
public class Enquiry {
	
	@Id
	@GeneratedValue
	@Column(name = "enquiry_id")
	private int enquiry_id;
	
	@Column(name= "subj")
	private String subj;
	
	
	@OneToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "cid")
	private Customer customer;
	
	
	public Enquiry( String subj,Customer customer) {
		//this.enquiry_id = enquiry_id;
		this.subj = subj;
		this.customer = customer;
		
	}

	public int getEnquiry_id() {
		return enquiry_id;
	}

	public void setEnquiry_id(int enquiry_id) {
		this.enquiry_id = enquiry_id;
	}

	public String getSubj() {
		return subj;
	}

	public void setSubj(String subj) {
		this.subj = subj;
	}
	
	
	
	
	

}
