package com.example.feedback.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.feedback.entities.Feedback;
import com.example.feedback.repositories.FeedbackRepository;
import com.example.feedback.services.FeedbackService;

@RestController
public class MainController {
	@Autowired
	private FeedbackService feedbackservice;
	@Autowired
	private FeedbackRepository feedbackrepository;
	@GetMapping(value="/")
	public String ShowIndex(ModelMap model) {
		return "<html>\n"
		 		+ "<head>\n"
		 		+ "	<style>\n"
		 		+ "		.center {\n"
		 		+ "	  		text-align: center;\n"
		 		+ "	  	}\n"
		 		+ "	  	\n"
		 		+ "	</style>\n"
		 		+ "</head>\n"
		 		+ "<body>\n"
		 		+ "	<div class=\"center\">\n"
		 		+ "		<h1>User Feedback Page</h1>\n"
		 		+ "		\n"
				+ "		<br>"
				+ "     <form method=\"get\" action=\"update\">\n"
				+ "			<br><h3>Enter your feedback below:</h3>\n"
				+ "			<input type=\"text\" id=\"name\" name=\"name\" placeholder=\"Name Here\" required>	\n"
				+ "			<br>"
				+ "			<input type=\"number\" id=\"rating\" name=\"rating\" placeholder=\"Rating Here\" required>\n"
				+ "			<br>"
				+ "			<input type=\"text\" id=\"comment\" name=\"comment\" placeholder=\"Comment Here\" required>\n"
				+ "			<br>"
				+ "			<input type=\"submit\" value=\"Enter\" />\n"
				+ "		</form>"
				+ "		\n"
				+ "		<br>"
		 		+ "		<a href=\"/feedback\">View all feedback</a>\n"
		 		+ "	</div>\n"
		 		+ "</body>\n"
		 		+ "</html>";			
	}
	
	@GetMapping("/feedback")
	public @ResponseBody String getAllFeedbacks() {
        Iterable<Feedback> AllFeedback = feedbackrepository.findAll();
        return "<html>\n"
 		+ "<head>\n"
 		+ "	<style>\n"
 		+ "		.center {\n"
 		+ "	  		text-align: center;\n"
 		+ "	  		align-items: center;\n"
 		+ "	  	}\n"
 		+ "	  	\n"
 		+ "	</style>\n"
 		+ "</head>\n"
 		+ "<body >\n"
 		+ "	<div class=\"center\">\n"
 		+ "<h1>Feedback Table</h1>\n"
		+ AllFeedback.toString()
        + "	</div>\n"
 		+ "</body>\n"
 		+ "</html>";

    }
	
	 @GetMapping("/update")
	    public String getEmployeeByName(@RequestParam("comment") String comment, @RequestParam("rating") int rating, @RequestParam("name") String name) {
	 
	    	
	    	Feedback f = new Feedback(comment, rating, name);
	    	feedbackrepository.save(f);
	 
	        return "<html>\n"
			 		+ "<head>\n"
			 		+ "</head>\n"
			 		+ "<body>\n"
			 		+ "	<div class=\"center\">\n"
			 		+ "		<h2 class=\"hello-title\">Successfully Added Your Feedback</h2>\n"
			 		+ "		\n"
			 		+ "		<a href=\"/feedback\">Click here to view all feedback</a>\n"
			 		+ "	</div>\n"
			 		+ "</body>\n"
			 		+ "</html>";
	    }
	
}
