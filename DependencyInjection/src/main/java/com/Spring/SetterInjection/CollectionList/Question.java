package com.Spring.SetterInjection.CollectionList;

import java.util.List;

public class Question {
	private int id;
	private String question;
	private List<Answer> answers;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answer> getAnswers() {
		return answers;
	}

	public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}

	public void display() {
		System.out.println("id: "+id);
		System.out.println("Question: "+question);
		answers.forEach(answer->System.out.println(answer));

	}

}
