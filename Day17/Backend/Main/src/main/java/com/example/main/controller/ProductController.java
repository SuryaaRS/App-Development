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
import com.example.main.entity.Product;
import com.example.main.service.ProductService;




@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	ProductService s1;
	
	@PostMapping("/postnewproduct")
	 public ResponseEntity<String> postProductDetails(@RequestBody Product p1) {
        s1.postProductDetails(p1);
        return ResponseEntity.ok().build();
    }


	@GetMapping("/getAllproduct")
	public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = s1.getAllProducts();
        return ResponseEntity.ok(products );
    }


		
	@PutMapping("/changeproduct/{id}")
	public Product updateDetails(@RequestBody Product p1)
	{
		return s1.updateDetails(p1);
	}

	@DeleteMapping("/delproductbyid/{id}")
	public ResponseEntity<String> deleteproductDetails(@PathVariable ("id") int id) {
        try {
            s1.deleteproductDetails(id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
