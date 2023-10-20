package com.springcore.setterinjection.primitives;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String args[]) {
		//System.out.println("Hello World !");
		// we don't have to create object we will tell the IOC Container to give us object of Student1
		//Instantiating a container
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/setterinjection/primitives/primitiveconfig.xml");
		Student std1 = (Student) context.getBean("Student1");
		Student std2 = (Student) context.getBean("Student2");
		Student std3 = (Student) context.getBean("Student3");
		System.out.println(std1);
		System.out.println(std2);
		System.out.println(std3);
	}

}
