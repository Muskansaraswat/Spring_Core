package com.springcore.referencetype;

public class FirstClass {
	private int num1;
	private SecondClass ob;
	public int getNum1() {
		return num1;
	}
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public SecondClass getOb() {
		return ob;
	}
	public void setOb(SecondClass ob) {
		this.ob = ob;
	}
	public FirstClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "FirstClass [num1=" + num1 + ", ob=" + ob + "]";
	}
}
