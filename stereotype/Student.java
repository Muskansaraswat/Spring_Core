package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component but you have to use getBean("student") otherwise you get no such bean found exception 
@Component("obj")
//Using @Scope Annoatation
@Scope("prototype")
public class Student {
	@Value("Muskan Saraswat")
	private String student_name;
	@Value("Mumbai")
	private String city;
	@Value("#{location}")
	private List<String> address;
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [student_name=" + student_name + ", city=" + city + ", address=" + address + "]";
	}

}
