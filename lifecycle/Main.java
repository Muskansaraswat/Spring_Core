package com.springcore.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


public class Main {

	public static void main(String[] args) {
			AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/bookconfig.xml");
			context.registerShutdownHook();
			Book b1=(Book) context.getBean("Book1");
			System.out.println(b1);
			System.out.println("-----------------------------");
			Novel n1=(Novel) context.getBean("Novel1");
			System.out.println(n1);
			Pen p1=(Pen) context.getBean("Pen1");
			System.out.println(p1);
			
			

	}

}
