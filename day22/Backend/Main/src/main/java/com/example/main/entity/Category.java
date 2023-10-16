package com.example.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="category_details")
public class Category {

	@Id
	private Long categoryid;
	private String categoryname;
	private String categorydesc;
	private String producername;
	
	
	
	public Category() {
		
	}

	public Category(Long categoryid, String categoryname, String categorydesc, String producername) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.categorydesc = categorydesc;
		this.producername = producername;
	}



	public Long getCategoryid() {
		return categoryid;
	}



	public void setCategoryid(Long categoryid) {
		this.categoryid = categoryid;
	}



	public String getCategoryname() {
		return categoryname;
	}



	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}



	public String getCategorydesc() {
		return categorydesc;
	}



	public void setCategorydesc(String categorydesc) {
		this.categorydesc = categorydesc;
	}



	public String getProducername() {
		return producername;
	}



	public void setProducername(String producername) {
		this.producername = producername;
	}
	

}