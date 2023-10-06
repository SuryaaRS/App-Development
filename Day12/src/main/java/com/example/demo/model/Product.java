package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="product")
public class Product {
        @Id
        @GeneratedValue(strategy=GenerationType.IDENTITY)
        private int id;
        private int price;
        private  String name;
        private String category;
        
        
        
		public Product(int id, int price, String name, String category) {
			super();
			this.id = id;
			this.price = price;
			this.name = name;
			this.category = category;
			
		}
		public Product()
		{
			
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
        
        
}

