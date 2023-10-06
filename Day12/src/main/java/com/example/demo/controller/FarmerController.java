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

import com.example.demo.model.Farmer;
import com.example.demo.service.FarmerService;

@RestController
@CrossOrigin
public class FarmerController {
	
	@Autowired
	FarmerService s2;
	
	@PostMapping("/postfarmer")
	public String newFarmer(@RequestBody Farmer f1)
	{
		return s2.newFarmer(f1);
	}
	
	@GetMapping("/getfarmer")
	public List<Farmer> readFarmer()
	{
		return s2.readFarmer();
	}
	
	@PutMapping("/putfarmer/{id}")
	public Farmer updateDetails(@RequestBody Farmer f1)
	{
		return s2.updateDetails(f1);
	}
	@DeleteMapping("/delfarmer/{id}")
	public String deleteFarmer(@PathVariable("id") int id)
	{
		return s2.deleteFarmer(id);
	}
	

}
