package com.springcore.setterinjection.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	private String emp_name;
	private List<String> phones;
	private Set<String> unique_id;
	private Map<String,String> courses;
	private Properties pros;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String emp_name, List<String> phones, Set<String> unique_id, Map<String, String> courses,
			Properties pros) {
		super();
		this.emp_name = emp_name;
		this.phones = phones;
		this.unique_id = unique_id;
		this.courses = courses;
		this.pros = pros;
	}
	
	public Properties getPros() {
		return pros;
	}
	public void setPros(Properties pros) {
		this.pros = pros;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getUnique_id() {
		return unique_id;
	}
	public void setUnique_id(Set<String> unique_id) {
		this.unique_id = unique_id;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
/*
	@Override
	public String toString() {
		return "Employee [emp_name=" + emp_name + ", phones=" + phones + ", unique_id=" + unique_id + ", courses="
				+ courses + "]";
	}
*/

}
