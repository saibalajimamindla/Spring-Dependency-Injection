package com.Spring.ConstructorInjection.collectionPrac;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("collectionPrc.xml");
		
		Question quest = (Question) context.getBean("que");
		
		quest.display();
		
		
		Employee emp = (Employee) context.getBean("emp");
		
		emp.display();
	}

}
