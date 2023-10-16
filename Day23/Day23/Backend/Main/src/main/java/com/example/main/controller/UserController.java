package com.example.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.main.entity.User;
import com.example.main.service.UserService;

@RestController
@RequestMapping("/userr")
public class UserController {
	
	@Autowired
	UserService service;
	

	@PutMapping("/updateUser/{id}")
	public String update(@RequestBody User u,@PathVariable("id") long id) {
		
		return service.update(u,id);
	}
	
	@DeleteMapping("/deleteUser/{uid}")
	public ResponseEntity<String> delete(@PathVariable ("uid") int uid) {
        try {
            service.delete(uid);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
