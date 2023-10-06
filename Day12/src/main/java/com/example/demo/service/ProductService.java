package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo r1;
	
	public List<Product> readProduct()
	{
		return r1.findAll();
	}
	
	public String createProduct(Product p1)
	{
		  r1.save(p1);
		  return "Product Details are saved";
	}
     
	public Product updateDetails(Product p1)
 	{
 		System.out.println("Changes updated");
 		return r1.save(p1);
 	}
	 public String deleteProduct(@PathVariable("id") int id)
	 {
	 		 r1.deleteById(id);
	 		 return "This id: "+id+" is deleted";
	 }
}