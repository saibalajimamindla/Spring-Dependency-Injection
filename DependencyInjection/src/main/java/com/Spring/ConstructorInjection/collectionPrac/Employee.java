package com.Spring.ConstructorInjection.collectionPrac;

import java.util.Map;

public class Employee {

	private int id;
	private String name;
	private Map<String, String> project;

	public Employee(int id, String name, Map<String, String> project) {
		this.id = id;
		this.name = name;
		this.project = project;
	}

	public void display() {

		System.out.println("id: "+id);
		System.out.println("name: "+name);
		project.forEach((technology,project)->System.out.println("Technology:"+technology+" Project: "+project));
	}

}
