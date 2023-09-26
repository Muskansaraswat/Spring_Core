package com.springcore.constructorinjection;

import java.util.List;

public class Person {
	
	private String name;
	private int age;
	private certify certi;
	private List<String> degree;
	
	public Person(String name, int age, certify certi,List<String> degree) {
		super();
		this.name = name;
		this.age = age;
		this.certi = certi;
		this.degree=degree;
	}
	
	@Override
	public String toString() {
		return "Person {name=" + name + ", age=" + age + ", certify=" + certi + ", degree="+ degree +"}";
	}
	
	
}
