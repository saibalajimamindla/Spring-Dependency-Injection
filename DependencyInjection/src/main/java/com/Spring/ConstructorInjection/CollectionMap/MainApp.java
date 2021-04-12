package com.Spring.ConstructorInjection.CollectionMap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("CollectionMap.xml");
		
		Question qu = (Question) context.getBean("question");
		
		qu.displayInfo();
	}

}
