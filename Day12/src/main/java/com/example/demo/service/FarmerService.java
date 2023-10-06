package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.model.Farmer;
import com.example.demo.repository.FarmerRepo;



@Service
public class FarmerService {
     @Autowired
     FarmerRepo r2;
      
 	
 	
     public String newFarmer(Farmer f1)
     {
    	 r2.save(f1);
    	 return "Farmer Details are saved";
     }
     public List<Farmer> readFarmer()
     {
    	 return r2.findAll();
     }
     public Farmer updateDetails(Farmer f1)
 	{
 		System.out.println("Changes updated");
 		return r2.save(f1);
 	}
     public String deleteFarmer(@PathVariable("id") int id)
 	{
 		 r2.deleteById(id);
 		 return "This id: "+id+" is deleted";
 	}
}
