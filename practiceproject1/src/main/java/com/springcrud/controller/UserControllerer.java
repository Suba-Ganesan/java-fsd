package com.springcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springcrud.beans.User;
import com.springcrud.dao.UserDao;

@Controller
public class UserControllerer { 
	@Autowired
	UserDao dao;
	
	
	@RequestMapping(value="/userform",  method=RequestMethod.GET)
	public String showForm(Model m){
		m.addAttribute("u", new User());
		return "userform";
		
	}
	

	@RequestMapping("/viewuser")
	public String viewuser(Model m){
		List<User> userList= dao.getUsersDetails();
		m.addAttribute("userList",userList);
		return "viewuser";
	}
	
	@RequestMapping(value="/edituser/{id}")
	public String edit(@PathVariable int id, Model m){
		
		User u=dao.getId(id);
		m.addAttribute("u",u);
		return "usereditform";
	}
	@RequestMapping(value="/editsave",method=RequestMethod.POST)
	public String editSave(@ModelAttribute("u") User u){
		
		System.out.println(u.getId());
		dao.update(u);
		return "redirect:/viewuser";
	}
	
	
	
}

