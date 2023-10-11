package com.example.main.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="vendordetails")
public class Vendor {
	@Id
	private int vendor_id;
	private String farmname;
	private String farmdesc;
	private String vendornum;
	@OneToMany
	
	private List<Product> prod;
	
	public Vendor() {
		
	}
    
	public Vendor(int vendor_id, String farmname, String farmdesc, String vendornum, List<Product> prod) {
		super();
		this.vendor_id = vendor_id;
		this.farmname = farmname;
		this.farmdesc = farmdesc;
		this.vendornum = vendornum;
		this.prod = prod;
	}

	public int getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(int vendor_id) {
		this.vendor_id = vendor_id;
	}

	public String getFarmname() {
		return farmname;
	}

	public void setFarmname(String farmname) {
		this.farmname = farmname;
	}

	public String getFarmdesc() {
		return farmdesc;
	}

	public void setFarmdesc(String farmdesc) {
		this.farmdesc = farmdesc;
	}

	public String getVendornum() {
		return vendornum;
	}

	public void setVendornum(String vendornum) {
		this.vendornum = vendornum;
	}

	public List<Product> getProd() {
		return prod;
	}

	public void setProd(List<Product> prod) {
		this.prod = prod;
	}
    
  
}
