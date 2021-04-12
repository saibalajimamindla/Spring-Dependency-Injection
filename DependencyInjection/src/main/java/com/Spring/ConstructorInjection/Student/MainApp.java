package com.Spring.ConstructorInjection.Student;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args) {
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		
		Student stu = (Student) context.getBean("student");
		
		stu.display();
		
		
	}

}
