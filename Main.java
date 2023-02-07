package com.java.corespring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ap=new ClassPathXmlApplicationContext("config.xml");
		Student st=(Student) ap.getBean("student1");
		System.out.println(st);
	}

}
