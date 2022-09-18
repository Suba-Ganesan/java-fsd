package com.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FeedbackDao {

	@Autowired
	private JdbcTemplate Template;
	
	public ResponseEntity<String> addFeedback(FeedbackEntity feedback) {
		int count = (int)Template.update("insert into feedback (name,email,feedback) values (?,?,?)", 
				feedback.getName(),feedback.getEmail(),feedback.getFeedback());
		if(count>0)
			return new ResponseEntity<String>("Thanks for your feedback",HttpStatus.OK);
		else
			return new ResponseEntity<String>("Error in inserting",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}