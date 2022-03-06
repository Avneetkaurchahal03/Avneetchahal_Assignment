package com.avneet;

import java.util.List;

public class list {
	private int questionId;
	private String question;
	private List<String> answers;

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

	public List<String> getAnswers() {
		return answers;
	}

	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}

	/*public void solutions() {
		System.out.println(
				"Question_List [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]");
	}*/




	

	public list() {
		super();
	}

	public list(int questionId, String question, List<String> answers) {
		super();
		this.questionId = questionId;
		this.question = question;
		this.answers = answers;
	}

	@Override
	public String toString() {
		return "list [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
	}

	
	
	
}


