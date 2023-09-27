package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
		Student st=context.getBean("obj",Student.class);
//		System.out.println(st);
//		System.out.println(st.getAddress());
		System.out.println(st.hashCode());
		Student st2=context.getBean("obj",Student.class);
		System.out.println(st2.hashCode());
		Teacher t1=context.getBean("teacher",Teacher.class);
		Teacher t2=context.getBean("teacher",Teacher.class);
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		
	}

}
