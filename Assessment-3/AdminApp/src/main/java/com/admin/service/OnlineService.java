package com.admin.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.admin.model.Questions;
import com.admin.model.User;
import com.admin.repository.QuestionRepository;
import com.admin.repository.UserRepository;
import com.admin.model.QuestionForm;
import com.admin.model.Result;
import com.admin.repository.ResultRepo;

@Service
public class OnlineService {

	@Autowired
	QuestionRepository quesRepo;
	
	@Autowired
	com.admin.repository.ResultRepo rRepo;
	
	@Autowired
	QuestionForm qForm;

	@Autowired
	UserRepository userRepo;

	

	public String adminlogin(User user) {

		Optional<User> op = userRepo.findById(user.getId());
		if (op.isPresent()) {
			return "Login Successfully";
		} else {

			return "wrong credentials , try agin!!!";
		}
	}

	public String changeAdminPassword(User user) {
		Optional<User> op = userRepo.findById(user.getId());
		if (op.isPresent()) {
			User e = op.get();
			e.setPassword(user.getPassword());
			userRepo.saveAndFlush(e); 
			return "Password changed successfully";
		} else {

			return "Password not changed , try again !!!";
		}
	}

	
	
	public String addQuestions(Questions quest) {
		
		Optional<Questions> op = quesRepo.findById(quest.getQid());
		if(op.isPresent()) {
			return "try adding again , this question exist";
		}else {
				quesRepo.save(quest);				
				return "question added successfully";
		}
	}
	
	
	public String updateQuestions(Questions ques) {
		Optional<Questions> op = quesRepo.findById(ques.getQid());
		if(op.isPresent()) {
				 	Questions e	= op.get();
				 	e.setQuestion(ques.getQuestion());
				 	e.setOption1(ques.getOption1());
				 	e.setOption2(ques.getOption2());
				 	e.setOption3(ques.getOption3());
				 	e.setAnswer(ques.getAnswer());
				 	e.setChose(ques.getChose());
				 	quesRepo.saveAndFlush(e);		
				 	return "Question and option updated successfully";
		}else {
				
				return "Question and option not updated";
		}
	}
	
	public String deleteQuestions(int qid) {
		Optional<Questions> op = quesRepo.findById(qid);
		if(op.isPresent()) {
						Questions e = op.get();
						quesRepo.delete(e);
			return "Question deleted successfully";
		}else {
				return "Question not deleted, Check your QuestionID";
		}
	}
	
	
	public String findQuestions(int qid) {
		Optional<Questions> op = quesRepo.findById(qid);
		if(op.isPresent()) {
			Questions e = op.get();
			return e.toString();
		}else {
			return "try to enter unique question id!!!";
		}
	}
	
	public List<Result> getTopScore() {
		List<Result> sList = rRepo.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
		
		return sList;
	}
	
	
	
	public QuestionForm getQuestion() {
		List<Questions> allQues = quesRepo.findAll();
		List<Questions> qlist = new ArrayList<Questions>();
		
		Random random = new Random();
		 for(int i=0; i<5; i++)
		 {
			 int rand = random.nextInt(allQues.size());
			 qlist.add(allQues.get(rand));
			 allQues.remove(rand);
		 }
		 
		 qForm.setQuestions(qlist);
		 
		  return qForm;
	}
}
