package com.springcrud.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import com.springcrud.beans.User;

public class UserDao {
	JdbcTemplate template;
	public void setTemplate(JdbcTemplate template){
		this.template=template;
	}

	public int update(User u){
		String sql="update User1 set fname=?, lname=?, email=? where id=?";
		int ans=template.update(sql,u.getFname(),u.getLname(),u.getEmail(),u.getId());
		return ans;
	}	
	public User getId(int id){
		String sql="select * from User1 where id=?";
		@SuppressWarnings("deprecation")
		User u=template.queryForObject(sql,new Object[]{id},new UserMapper());	
		return u;
	}
	public List<User> getUsersDetails(){
		String sql="select * from User1";
		List<User>userList=template.query(sql,new UserMapper());
		return userList;
	}	
}

