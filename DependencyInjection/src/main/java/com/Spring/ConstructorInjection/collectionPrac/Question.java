package com.Spring.ConstructorInjection.collectionPrac;

import java.util.List;

public class Question {
	
	private int id;
	private String Question;
	private List<String> answers;
	
	public Question(int id, String question, List<String> answers) {
		this.id = id;
		this.Question = question;
		this.answers = answers;
	}
	
	public void display()
	{
		System.out.println("id: "+id);
		System.out.println("question: "+Question);
		answers.forEach(answer->System.out.println(answer));
	}

}
