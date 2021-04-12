package com.Spring.ConstructorInjection.CollectionList;

import java.util.List;

public class Question {
	
	private int id;
	private String question;
	private List<Answer> answers;
	
	public Question(int id, String question, List<Answer> answers) {
		this.id = id;
		this.question = question;
		this.answers = answers;
	}
	
	public void display()
	{
		System.out.println("id: "+id);
		System.out.println("Question: "+ question);
		answers.forEach(answer->System.out.println(answer));
	}

}
