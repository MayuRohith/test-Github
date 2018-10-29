package com.example.Login.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Login.Entity.User;
import com.example.Login.Service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	
@GetMapping("/user")
public List<User> viewAll(){
	return userService.getAllUser();
}

@PostMapping("/user")
public HttpStatus postUser(@RequestBody User user) {
	boolean add = userService.addUser(user);
	if(add) {
		return HttpStatus.CREATED;
	}
	return HttpStatus.BAD_REQUEST;
}

@PutMapping("/user/{id}")
public HttpStatus putUser(@RequestBody User user,@PathVariable Integer id) {
	boolean update = userService.updateUser(user, id);
	if(update) {
		return HttpStatus.ACCEPTED;
	}
	return HttpStatus.BAD_REQUEST;
}

@DeleteMapping("/user/{id}")
public HttpStatus removeUser(@PathVariable Integer id) {
	boolean remove = userService.deleteUser(id);
	if(remove) {
		return HttpStatus.ACCEPTED;
	}
	return HttpStatus.BAD_REQUEST;
}
}
