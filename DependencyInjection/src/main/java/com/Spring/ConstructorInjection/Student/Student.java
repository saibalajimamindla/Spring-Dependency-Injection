package com.Spring.ConstructorInjection.Student;

public class Student {

	private int id;
	private String name;
	private int rollno;
	private Adress adress;
	private Subjects subjects;

	public Student(int id, String name, int rollno, Adress adress, Subjects subjects) {
		this.id = id;
		this.name = name;
		this.rollno = rollno;
		this.adress = adress;
		this.subjects = subjects;
	}

	public void display() {
		System.out.println("id: " + id + " name: " + name + " rollno: " + rollno);
		System.out.println(adress.toString());
		System.out.println(subjects.toString());
	}
}
