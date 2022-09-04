package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.model.QuestionForm;
import com.user.model.Result;
import com.user.model.User;
import com.user.repository.QuestionRepository;
import com.user.repository.ResultRepo;
import com.user.repository.UserRepository;
import com.user.service.OnlineService;

@RestController
public class MainController {
	@Autowired
	QuestionRepository quesRepo;

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	ResultRepo rRepo;
	
	@Autowired
	Result result;

	@Autowired
	OnlineService service;
	
	boolean submitted = true;


	@RequestMapping(value = "/participants/signup", method = RequestMethod.POST)
	public String storeParticipants(@RequestBody User user) { 
		return service.storeParticipants(user);
	}
	
	@RequestMapping(value = "/participants/login", method = RequestMethod.POST)
	public String loginParticipants(@RequestBody User user) { 
		return service.loginParticipants(user);
	}
	
	@RequestMapping(value = "/participants/changePassword", method = RequestMethod.PUT)
	public String changeParticipantsPassword(@RequestBody User user) {
		return service.changeParticipantsPassword(user);
	}
	
	@RequestMapping(value = "/submit", method = RequestMethod.GET)
	public List<Result> submit( Result res) {

		return service.getTopScore();
}
	@RequestMapping(value = "/quiz", method = RequestMethod.POST)
	public String Quizz(@RequestParam String username) {
		submitted = false;
		result.setUsername(username);
		String url = "http://localhost:8081/startquiz";
		RestTemplate restTemplate = new RestTemplate();
		String quiz = restTemplate.getForObject(url, String.class);
		return quiz;	}

}
