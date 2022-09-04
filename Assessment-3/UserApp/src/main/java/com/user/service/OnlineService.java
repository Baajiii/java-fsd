package com.user.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.user.model.QuestionForm;
import com.user.model.Questions;
import com.user.model.Result;
import com.user.model.User;
import com.user.repository.QuestionRepository;
import com.user.repository.ResultRepo;
import com.user.repository.UserRepository;
@Service
public class OnlineService {
	
	@Autowired
	QuestionRepository quesRepo;

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ResultRepo rRepo;
	
	@Autowired
	QuestionForm qForm;
	
	
	public String storeParticipants(User user) {

		Optional<User> op = userRepo.findById(user.getId());
		if (op.isPresent()) {
			return "User id must be unique , pls try again";
		} else {
			userRepo.save(user); // insert new record
			return "User registered successfully";
		}
	}
	
	public String loginParticipants(User user) {

		Optional<User> op = userRepo.findById(user.getId());
		if (op.isPresent()) {
			return "Login Successfully";
		} else {
			
			return "wrong credentials , try agin!!!";
		}
	}
	
	
	public String changeParticipantsPassword(User user) {
		Optional<User> op = userRepo.findById(user.getId());
		if (op.isPresent()) {
			User e = op.get();
			e.setPassword(user.getPassword());
			userRepo.saveAndFlush(e); 
			return "Password changed successfully";
		} else {

			return "Password not changed";
		}
	}
	
	
	
	public int getResult(QuestionForm qForm) {
		int correct = 0;
		
		for(Questions q: qForm.getQuestions())
			if(Integer.parseInt (q.getAnswer()) == q.getChose())
				correct++;
		
		return correct;
	}
	
	public void saveScore(Result result) {
		Result saveResult = new Result();
		saveResult.setUsername(result.getUsername());
		saveResult.setTotalCorrect(result.getTotalCorrect());
		 rRepo.save(saveResult);
	}
	
	public List<Result> getTopScore() {
		List<Result> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
		
		return sList;
	}
}
