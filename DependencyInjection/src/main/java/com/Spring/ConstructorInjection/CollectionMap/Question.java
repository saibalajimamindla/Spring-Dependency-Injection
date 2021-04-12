package com.Spring.ConstructorInjection.CollectionMap;

import java.util.Map;

public class Question {
	private int id;
	private String name;
	private Map<Answer, User> answers;

	public Question() {
	}

	public Question(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void displayInfo() {
		System.out.println("question id:" + id);
		System.out.println("question name:" + name);
		System.out.println("Answers....");
		answers.forEach(
				(answer, user) -> System.out.println("Answer Information:" + answer + "\\n" + "Posted By:" + user));

	}
}
