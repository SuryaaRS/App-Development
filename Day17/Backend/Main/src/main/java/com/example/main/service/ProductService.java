package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.main.entity.Product;
import com.example.main.repository.ProductRepository;



@Service
public class ProductService {
	
	@Autowired
	ProductRepository r1;
	
	public String postProductDetails(Product p1)
	{
		  r1.save(p1);
		  return "Product Details are saved";
	}
     
	public List<Product> getAllProducts() {
        return r1.findAll();
    }
	
	public Product updateDetails(Product p1)
 	{
 		System.out.println("Changes updated");
 		return r1.save(p1);
 	}
	 public String deleteproductDetails(@PathVariable("id") int id)
	 {
	 		 r1.deleteById(id);
	 		 return "This id: "+id+" is deleted";
	 }
}
