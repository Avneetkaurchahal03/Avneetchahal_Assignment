package com.avneet;


import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class questionss {
	private int questionId;
	private String question;
	private Map<Integer, String> answers;

	public int getQuestionId() {
		return questionId;
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
