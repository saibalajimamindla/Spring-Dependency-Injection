package com.Spring.ConstructorInjection.Student;

public class Subjects {
	
	private String subject1;
	private String subject2;
	private String subject3;
	
	

	public Subjects(String subject1, String subject2, String subject3) {
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
	}
	
	@Override
	public String toString() {
		return "Subjects [subject1=" + subject1 + ", subject2=" + subject2 + ", subject3=" + subject3 + "]";
	}

}
