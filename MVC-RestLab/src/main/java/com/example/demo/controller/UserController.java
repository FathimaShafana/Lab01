package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.doa.UserDao;
import com.example.demo.doa.UserJPADao;
import com.example.demo.model.User;

//@Controller
@RestController
public class UserController {

	//To inject this variable on run-time
	@Autowired
	UserDao dao;
	
	@Autowired
	UserJPADao jpaDao;
	
	@RequestMapping(path="/", method = RequestMethod.GET)
		public String home() {
		return "home.jsp";
	}
	
	
	@RequestMapping( path ="/addUser", method = RequestMethod.GET)
	public String addUser(User user) {
	//we need to say to DB to save the user
	dao.save(user);
	return "home.jsp";
	}
	
	
	@RequestMapping(path="/getUser", method = RequestMethod.GET)
	public ModelAndView getUser(@RequestParam int uid){
	ModelAndView mv = new ModelAndView("showUser.jsp");
	User e = dao.findById(uid).orElse(new User());
	mv.addObject(e);
	
	System.out.println(dao.findByNationality("Sri Lanka"));
	System.out.println(dao.findByUidGreaterThan(101));
	System.out.println(dao.findByNationalitySorted("Hong Kong"));
	
	return mv;
	}
	
	//RESTFUL CALLS to get all users
	@RequestMapping(path = "/users", method = RequestMethod.GET)
	@ResponseBody	
	public String getUsersREST() {
		return dao.findAll().toString();
	}
	
	//RESTFUL CALLS to get all users JPA
	@RequestMapping(path = "/usersJPA", method = RequestMethod.GET)
	@ResponseBody	
	public List<User> getUsersRESTJPA() {
		return jpaDao.findAll();
		
	}
	
	//RESTFUL CALLS to get a user by ID
		@RequestMapping(path = "/user/{uid}", method = RequestMethod.GET)
		@ResponseBody	
		public String getUserREST(@PathVariable("uid") int uid) {
			return dao.findById(uid).toString();
			
		}
		
		//RESTFUL CALLS to return java object of single user as JSON or XML
			@RequestMapping(path = "/userJPA/{uid}", method = RequestMethod.GET, produces="application/json")
			@ResponseBody	
			public Optional<User> getUserRESTJPA(@PathVariable("uid") int uid) {
				return jpaDao.findById(uid);
					
			}
			
			//RESTFUL CALLS to create user
			@RequestMapping(path = "/userJPA", method = RequestMethod.POST, consumes = {"application/json"})
			@ResponseBody	
			public User postUser(@RequestBody User user) {
				jpaDao.save(user);
				return user;
				
			}
			
			//RESTFUL CALLS to save or update user
			@RequestMapping(path = "/userJPA", method = RequestMethod.PUT, consumes = {"application/json"})
			@ResponseBody	
			public String saveOrUpdateUser(@RequestBody User user) {
				jpaDao.save(user);
				//return user if your method is public User;
				return "Updated";
				
			}
			
			//RESTFUL CALLS to delete an user
			@RequestMapping(path = "/userJPA/{uid}", method = RequestMethod.DELETE, consumes = {"application/json"})
			@ResponseBody	
			public String deleteUser(@PathVariable("uid")int uid) {
				User user = jpaDao.getOne(uid);
				jpaDao.delete(user);
				//return user;
				return "Deleted";
				
			}

}
