package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collections/stdaloneconfig.xml");
		Person person1=context.getBean("person1",Person.class);
		//System.out.println(list1.getFriends().getClass());
		System.out.println(person1);
		System.out.println("--------------------");
		System.out.println(person1.getFriends());
		System.out.println("--------------------");
		System.out.println(person1.getFeeStructure());
		System.out.println("--------------------");
		System.out.println(person1.getProps());
	}

}
