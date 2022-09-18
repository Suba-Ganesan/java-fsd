package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private FeedbackDao dao;
	@RequestMapping(value = "/feedback",method = RequestMethod.POST)
	public void addFeedback(FeedbackEntity feedback) {
		dao.addFeedback(feedback);	
//		int count=dao.addFedback(feedback);
//		if(count>0)
//			return new ResponseEntity<String>("Thanks for your feedback",HttpStatus.OK);
//		else
//			return new ResponseEntity<String>("Error in inserting",HttpStatus.INTERNAL_SERVER_ERROR);
	}
}