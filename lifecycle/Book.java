package com.springcore.lifecycle;

public class Book {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		System.out.println("Setting Book Price");
		this.price = price;
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "[Purchasing Price of Book =" + price + "]";
	}
	public void init() {
		System.out.println("Going to Read The Book");
	}
	public void destroy() {
		System.out.println("I had read the Book");
	}

}
