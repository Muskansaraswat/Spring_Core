package com.springcore.constructorinjection;

public class certify {
	
	String name;

	@Override
	public String toString() {
		return this.name;
	}

	public certify(String name) {
		super();
		this.name=name;
	}

	
}
