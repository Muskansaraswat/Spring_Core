package com.springcore.SpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/SpEL/spelconfig.xml");
		Demo demo=context.getBean("demo",Demo.class);
		System.out.println(demo.getX()+demo.getY());
		System.out.println(demo.getX()+" "+demo.getY());
		System.out.println(demo);
	}

}
