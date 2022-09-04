package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.admin.model.Questions;
import com.admin.model.User;
import com.admin.repository.QuestionRepository;
import com.admin.repository.UserRepository;
import com.admin.service.OnlineService;
import com.admin.model.QuestionForm;
import com.admin.model.Result;

@RestController
public class MainController {

	@Autowired
	QuestionRepository quesRepo;

	@Autowired
	UserRepository userRepo;
	
	@Autowired
	com.admin.model.QuestionForm qFrom;

	@Autowired
	OnlineService service;

	@RequestMapping(value = "/admin/login", method = RequestMethod.POST)
	public String adminlogin(@RequestBody User user) {
		return service.adminlogin(user);
	}

	@RequestMapping(value = "/admin/changePassword", method = RequestMethod.PUT)
	public String changeAdminPassword(@RequestBody User user) {
		return service.changeAdminPassword(user);
	}

	

	@RequestMapping(value = "/admin/addQuestions", method = RequestMethod.POST)
	public String addQuestions(@RequestBody Questions ques) { 
		return service.addQuestions(ques);
	}

	@RequestMapping(value = "/admin/updateQuestions", method = RequestMethod.PUT)
	public String updateQuestions(@RequestBody Questions ques) {
		return service.updateQuestions(ques);
	}

	@RequestMapping(value = "admin/findQuestionsById/{qid}", method = RequestMethod.GET)
	public String findQuestions(@PathVariable("qid") int qid) {
		return service.findQuestions(qid);
	}

	@RequestMapping(value = "admin/deleteQuestionsById/{qid}", method = RequestMethod.DELETE)
	public String deleteQuestions(@PathVariable("qid") int qid) {
		return service.deleteQuestions(qid);
	}

	@RequestMapping(value = "/participants/result", method = RequestMethod.GET)
	public List<Result> ViewResult(Result res) {

		return service.getTopScore();
	}

	
	@RequestMapping(value = "/startquiz", method = RequestMethod.GET)
	public com.admin.model.QuestionForm Quiz() {
		return service.getQuestion();
	}
}
