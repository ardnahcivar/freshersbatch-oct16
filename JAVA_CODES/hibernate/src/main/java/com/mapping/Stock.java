package com.mapping;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Stock")
public class Stock {
	
	@Id
	@GeneratedValue
	@Column(name = "stock_id")
	private int stock_id;
	
	
	@Column(name = "Stock Name")
	private String nameOfStock;
	
	
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name = "market_id")
	private Market market;

	
	public Stock(){
		
	}

	public Stock(String nameOfStock, Market market) {
		this.nameOfStock = nameOfStock;
		this.market = market;
	}


	public int getStock_id() {
		return stock_id;
	}


	public void setStock_id(int stock_id) {
		this.stock_id = stock_id;
	}


	public String getNameOfStock() {
		return nameOfStock;
	}


	public void setNameOfStock(String nameOfStock) {
		this.nameOfStock = nameOfStock;
	}


	public Market getMarket() {
		return market;
	}


	public void setMarket(Market market) {
		this.market = market;
	}


	@Override
	public String toString() {
		return "Stock [stock_id=" + stock_id + ", nameOfStock=" + nameOfStock + ", market=" + market + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
