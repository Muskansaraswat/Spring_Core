package com.springcore.constructorinjection;

public class AmbiguityProblem {
	private int num1;
	private int num2;
	
	public AmbiguityProblem(float num1, float num2) {
		super();
		this.num1 = (int)num1;
		this.num2 = (int)num2;
		System.out.println("float Constructor");
	}
	public AmbiguityProblem(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Value at index 0 :"+this.num1+" index 1 : "+this.num2);
		System.out.println("int Constructor");
	}
	public AmbiguityProblem(String num1, String num2) {
		super();
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("String Constructor");
	}
	
	public void Add() {
		System.out.println("Addtion is: "+(this.num1+this.num2));
	}

}
