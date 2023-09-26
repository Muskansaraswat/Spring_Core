package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Pen {
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		System.out.println("Setting Pen Color");
		this.color = color;
	}
	
	public Pen() {
		super();
		//System.out.println("Inside Pen Constructor");
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		 return "Pen [color=" + color + "]";
	}
	@PostConstruct
	public void start() {
		//init
		 System.out.println("Starting Initialization");
	}
	@PreDestroy
	public void end() {
		//destroy
		System.out.println("Destroying");
	}
}
