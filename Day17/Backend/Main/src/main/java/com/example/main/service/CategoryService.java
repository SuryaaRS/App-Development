package com.example.main.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.main.entity.Category;
import com.example.main.repository.CategoryRepository;


@Service
public class CategoryService {
	@Autowired
	CategoryRepository cr;
	
	
	public String postCategoryDetails(Category c1)
	{
		  cr.save(c1);
		  return "Category Details are saved";
	}
	public List<Category> getAllCategories() {
        return cr.findAll();
    }
	 public Category getCategoryById(Long id)
	 {
	        return cr.findById(id).orElse(null);
	   }


	public Category updateDetails(Category c1)
 	{
 		System.out.println("Changes updated");
 		return cr.save(c1);
 	}
	public String deletecategoryDetails(@PathVariable("id") Long id)
	{
		     cr.deleteById(id);
	 		 return "This id: "+id+" is deleted";
	}

}
