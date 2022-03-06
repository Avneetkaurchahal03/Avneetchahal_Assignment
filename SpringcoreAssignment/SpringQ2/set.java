package com.avneet;

import java.util.Set;

public class set {
	
	private int questionId;
	private String question;
	private Set<String> answers;
	public int getQuestionId() {
		return questionId;
	}
	@Override
	public String toString() {
		return "set [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]";
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
	public Set<String> getAnswers() {
		return answers;
	}
	public void setAnswers(Set<String> answers) {
		this.answers = answers;
	}
	
	public void solutions() {
		System.out.println(
				"Question_Set [questionId=" + questionId + ", question=" + question + ", answers=" + answers + "]");
	}
	

}
