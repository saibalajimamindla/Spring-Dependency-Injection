package com.Spring.ConstructorInjection;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Employee.xml");
		
		Employee emp1 = (Employee) context.getBean("employee1");
		Employee emp2 = (Employee) context.getBean("employee2");
		
		System.out.println(emp1);
		System.out.println(emp2);
	}

}
