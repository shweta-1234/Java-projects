package com.laundry.entity;

public class Category {

	int id;
	String items;
	int washing_price;
	int ironing_price;
	int both_price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public int getWashing_price() {
		return washing_price;
	}

	public void setWashing_price(int washing_price) {
		this.washing_price = washing_price;
	}

	public int getIroning_price() {
		return ironing_price;
	}

	public void setIroning_price(int ironing_price) {
		this.ironing_price = ironing_price;
	}

	public int getBoth_price() {
		return both_price;
	}

	public void setBoth_price(int both_price) {
		this.both_price = both_price;
	}
}
