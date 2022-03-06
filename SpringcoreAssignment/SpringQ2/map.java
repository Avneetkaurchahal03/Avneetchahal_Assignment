package com.avneet;

import java.util.Map;

public class map {
	private int questionId;
	private String question;
	private Map<Integer, String> answers;

	public int getQuestionId() {
		return questionId;
	}

	public map() {
		super();
	}

	public map(int questionId, String question, Map<Integer, String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "map [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Map<Integer, String> getAnswers() {
		return answers;
	}

	public void setAnswers(Map<Integer, String> answers) {
		this.answers = answers;
	}

	public void solutions() {
		System.out.println(
				"Question_Map [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]");
	}

}