package com.Spring.SetterInjection.CollectionList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("SetterInjectionCollectionList.xml");
		Question que = (Question) context.getBean("question");
		
		que.display();
	}

}
