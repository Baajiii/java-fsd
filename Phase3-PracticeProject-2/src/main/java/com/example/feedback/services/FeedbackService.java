package com.example.feedback.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.feedback.entities.Feedback;
import com.example.feedback.repositories.FeedbackRepository;

@Service
public class FeedbackService {
	
	@Autowired
	private FeedbackRepository feedbackrepository;
	
	public Iterable<Feedback> GetAllFeedback(){
		return feedbackrepository.findAll();
	}

}
