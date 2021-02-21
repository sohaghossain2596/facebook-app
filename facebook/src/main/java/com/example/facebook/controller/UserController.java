package com.example.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebook.entity.User;
import com.example.facebook.repository.UserRepository;

@RestController
public class UserController {// run app
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("/user/create")
	public User saveUser(@RequestBody User user) {//
		return userRepository.save(user);// will save user in database
	}
	
	// user theka email and password nibe
	//2 ta input nibe tai @RequestParam use kora hoiche
	@GetMapping("/user")
	public User getUserByEmailAndPassword(@RequestParam String email, 
			@RequestParam String password) {
		
		return userRepository.findUserByEmailAndPassword(email, password);
	}
	
	@GetMapping("/user/{id}")// url er {id} ta id value /url er {} vitorer ta holo pathvariable
	public User getUserById(@PathVariable long id) {// akta input tai @PathVariable
		return userRepository.findUserById(id);
	}
@GetMapping ("/user1/{name}")//akane same url deya hoiche tai error
	public User getUserByName(@PathVariable String name) {// akane name r oknae id. keno? ami pagol holam
	
	return userRepository.findUserByName(name);//run kor. stop age//api checj kor api ki
}
	@GetMapping("user2/{email}")
	public User getUserByEmail(@PathVariable String email) {
		return userRepository.findUserByEmail(email);
	}
}
// goto main class. not here