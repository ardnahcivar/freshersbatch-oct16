package com.spring.LearnSpring;

public class Order {

	private int order_id;
	//@Autowired
	private Item item;
	
	public Order(int order_id, Item item) {
		this.order_id = order_id;
		this.item = item;
	}
	
	public Order(){
		
	}

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Order [order_id=" + order_id + ", item=" + item + "]";
	}
	
	
	
	
	
	
}
