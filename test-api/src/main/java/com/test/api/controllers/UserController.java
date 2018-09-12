package com.test.api.controllers;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.test.model.api.models.entities.User;
import com.test.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/api/user")
	public List<User> getUsers(){
		return userService.getUsers();
	}

	@RequestMapping(value = "/api/user/{id}")
	public User getUser(@PathVariable BigInteger id) {
		return userService.getUser(id);
	}

	@RequestMapping(value = "/api/user",method=RequestMethod.POST)
	public User insertUser(@RequestBody User user) {
		return userService.insertUser(user);
	}

	@RequestMapping(value = "/api/user/{id}",method=RequestMethod.PUT)
	public User updateUser(@PathVariable BigInteger id, @RequestBody User user) {
		return userService.updateUser(user);
	}

	@RequestMapping(value = "/api/user/{id}",method=RequestMethod.DELETE)
	public boolean deleteUser(@PathVariable BigInteger id) {
		return userService.deleteUser(id);
	}
	
}
