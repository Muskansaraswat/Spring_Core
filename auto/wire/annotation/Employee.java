package com.springcore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {
	
	@Autowired
	@Qualifier("address1")
	private Address address;

	public Address getAddress() {
		return address;
	}
	//@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	//@Autowired
	public Employee(Address address) {
		super();
		this.address = address;
		System.out.println("Inside Constructor");
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

}
