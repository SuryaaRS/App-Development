package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Signup;
import com.example.demo.repository.SignupRepo;

@Service
public class SignupService {
      @Autowired 
     SignupRepo r3;
  
      public List<Signup> readUser()
  	{
  		return r3.findAll();
  	}
  	

  	public String createUser(Signup u1)
  	{
  		  r3.save(u1);
  		  return "New User's Details are saved";
  	}
  	
  	public Signup updateDetails(Signup p1)
 	{
 		System.out.println("Changes updated");
 		return r3.save(p1);
 	}
  	 public String deleteUser(@PathVariable("id") int id)
	 {
	 		 r3.deleteById(id);
	 		 return "This id: "+id+" is deleted";
	 }
       
}
