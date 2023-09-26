package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/constructorinjection/constructorconfig.xml");
		Person p1=(Person) context.getBean("Person1");
		AmbiguityProblem sum=(AmbiguityProblem) context.getBean("add");
		sum.Add();
		
	}	

}
