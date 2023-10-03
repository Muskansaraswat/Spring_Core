package com.springcore.javaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Student {
	@Value("Shyam")
	private String std_name;
	public void doWork() {
		System.out.println(std_name+" Please do your home work");
	}

	public String getStd_name() {
		return std_name;
	}

	@Override
	public String toString() {
		return "Student [std_name=" + std_name + "]";
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

}
