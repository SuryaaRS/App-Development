package com.example.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="review")
public class Review {
	@Id
	private int reviewid;
	private String reviewText;
	
	@OneToOne
    @JoinColumn(name = "userid")
    private User userr;
	
	@OneToOne
    @JoinColumn(name = "vendorid")
    private Vendor vendor;
	
	@OneToOne
    @JoinColumn(name = "productid")
    private Product product;
	
	public Review() {
		super();
	}

	public Review(int reviewid, String reviewText, User userr, Vendor vendor, Product product) {
		super();
		this.reviewid = reviewid;
		this.reviewText = reviewText;
		this.userr = userr;
		this.vendor = vendor;
		this.product = product;
	}

	public int getReviewid() {
		return reviewid;
	}

	public void setReviewid(int reviewid) {
		this.reviewid = reviewid;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public User getUserr() {
		return userr;
	}

	public void setUserr(User userr) {
		this.userr = userr;
	}

	public Vendor getVendor() {
		return vendor;
	}

	public void setVendor(Vendor vendor) {
		this.vendor = vendor;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
}
