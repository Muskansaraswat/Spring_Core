package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
		Employee emp = (Employee) context.getBean("Employee1");
		//System.out.println(emp);
		System.out.println(emp.getEmp_name());
		System.out.println("List" +emp.getPhones());
		System.out.println("Set" +emp.getUnique_id());
		System.out.println("Map" +emp.getCourses());
		System.out.println("Properties" +emp.getPros());
    }
}
