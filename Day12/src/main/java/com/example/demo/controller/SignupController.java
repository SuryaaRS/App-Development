package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.model.Signup;
import com.example.demo.service.SignupService;

@RestController
@CrossOrigin
public class SignupController {
   @Autowired
   SignupService s3;
   
   @PostMapping("/postuser")
	public String createUser(@RequestBody Signup u1)
	{
		return s3.createUser(u1);
	}
	
	@GetMapping("/getuser")
	public List<Signup> readUser()
	{
		return s3.readUser();
	}
	
	@PutMapping("/putuser/{id}")
	public Signup updateDetails(@RequestBody Signup u1)
	{
		return s3.updateDetails(u1);
	}
	@DeleteMapping("/deluser/{id}")
	public String deleteUser(@PathVariable("id") int id)
	{
		return s3.deleteUser(id);
	}

}
