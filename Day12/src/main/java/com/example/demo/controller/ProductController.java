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
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;



@RestController
@CrossOrigin
public class ProductController {
	
	@Autowired
	ProductService s1;
	
	@PostMapping("/postproduct")
	public String createProduct(@RequestBody  Product p1)
	{
		return s1.createProduct(p1);
	}
	
	@GetMapping("/getproduct")
	public List<Product> readProduct()
	{
		return s1.readProduct();
	}
	
		
	@PutMapping("/putproduct/{id}")
	public Product updateDetails(@RequestBody Product p1)
	{
		return s1.updateDetails(p1);
	}
	@DeleteMapping("/delproduct/{id}")
	public String deleteProduct(@PathVariable("id") int id)
	{
		return s1.deleteProduct(id);
	}
}
