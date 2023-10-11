package com.example.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.main.entity.Category;
import com.example.main.service.CategoryService;


@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	CategoryService cs;
	

	@PostMapping("/postnewcategory")
	 public ResponseEntity<String> postCategoryDetails(@RequestBody Category c1) {
	      cs.postCategoryDetails(c1);
	        return ResponseEntity.ok().build();
	    }

	@GetMapping("/getAllcategory")
	public ResponseEntity<List<Category>> getAllCategories() {
        List<Category> categories = cs.getAllCategories();
        return ResponseEntity.ok(categories);
    }
	
	 @GetMapping("/get/{id}")
	 public ResponseEntity<Category> getCategoryById(@PathVariable Long id) {
	   try {
	         Category category = cs.getCategoryById(id);
	         return ResponseEntity.ok(category);
	       } 
	   catch (Exception e) {
	          return ResponseEntity.notFound().build();
	        }
	    }
		
	@PutMapping("/changecategory/{id}")
	public Category updateDetails(@RequestBody Category c1)
	{
		return cs.updateDetails(c1);
	}

	@DeleteMapping("/delcategorybyid/{id}")
	  public ResponseEntity<String> deletecategoryDetails(@PathVariable ("id") Long id) {
        try {
            cs.deletecategoryDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }


}
