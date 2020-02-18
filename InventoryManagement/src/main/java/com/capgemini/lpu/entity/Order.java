package com.capgemini.lpu.entity;

import java.time.LocalDate;

public class Order {
	
	private String orderId;
	private double price;
	private int orderQty;
	private LocalDate delDate;
	
	public Order(String orderId, double price, int orderQty, LocalDate delDate) {
		super();
		this.orderId = orderId;
		this.price = price;
		this.orderQty = orderQty;
		this.delDate = delDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public double getPrice() {
		return price;
	}

	public int getOrderQty() {
		return orderQty;
	}

	public LocalDate getDelDate() {
		return delDate;
	}
	
	@Override
	public String toString() {
		return "Order Id : " + orderId + " Price : " + price + 
				" Order Qty : " + orderQty + " Delivery Date : " + delDate;
	}
}
