package com.mapping;

import java.util.*;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Market")
public class Market {
	
	@Id
	@GeneratedValue
	@Column(name = "market_id")
	private int market_id;
	

	@Column(name = "status")
	private String status;



	public Market(String status) {
		this.status= status;
	}
	
	public Market(){
		
	}

	@OneToMany(mappedBy = "market",cascade = {CascadeType.ALL})
	private Set<Stock> stocks;
	
	
	public Set<Stock> getStocks() {
		return stocks;
	}



	public void setStocks(Set<Stock> stocks) {
		this.stocks = stocks;
	}



	public int getMarket_id() {
		return market_id;
	}


	public void setMarket_id(int market_id) {
		this.market_id = market_id;
	}


	
	public String getStatus() {
		return status;
	}


	public void setCollaborators(String status) {
		this.status = status;
	}
	
	
	
	
	

}
