package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/annotationconfig.xml");
		Employee e1=context.getBean("emp1",Employee.class);
		System.out.println(e1);
	}

}
