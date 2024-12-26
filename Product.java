package com.qa.pojo;

import java.util.Arrays;

public class Product {
	private String name;
	private String color;
	private int price;
	private String[] sellerName;
	
	public Product() {
		
	}
	
	public Product(String name,String color,int price,String[] sellerName) {
		this.name=name;
		this.color=color;
		this.price=price;
		this.sellerName=sellerName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String[] getSellerName() {
		return sellerName;
	}
	public void setSellerName(String[] sellerName) {
		this.sellerName = sellerName;
	}
	@Override
	public String toString() {
		return "Product [name="+name+", color=" + color + ", price=" + price + ", sellerName="
				+ Arrays.toString(sellerName) + "]";
	}
	
	

}
