package com.springcore.setterinjection.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/setterinjection/referencetype/refconfig.xml");
		FirstClass fc=(FirstClass) context.getBean("firstref");
		System.out.println(fc.getNum1());
		System.out.println(fc.getOb());
		System.out.println(fc.getOb().getNum2());
		SecondClass sc= (SecondClass) context.getBean("secondref");
		System.out.println(sc.getNum2());
		System.out.println(fc);
		System.out.println(sc);

	}

}
