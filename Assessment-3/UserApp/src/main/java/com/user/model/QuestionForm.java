package com.user.model;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class QuestionForm {

	private List<Questions> questions;
	
	public List<Questions> getQuestions() {
		return questions;
	}
	
	public void setQuestions(List<Questions> qlist) {
		this.questions = qlist;
	}
	
}