package com.Spring.SetterInjection.Collectionmap;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		 AbstractApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionCollectionMap.xml");
		 Question q = (Question) context.getBean("q1");
		 q.displayInfo();
	}

}
