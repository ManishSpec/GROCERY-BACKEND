package com.order.spec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CartEntity {
	
	@Id
	private String itemName;
	private int quantity;
	private int price;
	private String url;
	public CartEntity() {
		super();
	}
	public CartEntity(String itemName, int quantity, int price, String url) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
		this.url = url;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
}