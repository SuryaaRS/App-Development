package com.example.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.main.entity.Vendor;
import com.example.main.repository.VendorRepository;

@Service
public class VendorService {
	@Autowired
	VendorRepository vr;
	
	public String postVendorDetails(Vendor v1)
	{
		  vr.save(v1);
		  return "Vendor Details are saved";
	}
	public List<Vendor> readVendor()
	{
		return vr.findAll();
	}
     
	public Vendor updateVendor(Vendor v1)
 	{
 		System.out.println("Changes updated");
 		return vr.save(v1);
 	}

	 public String deletevendorDetails(@PathVariable("vendor_id") int vendor_id)
	    {
	        vr.deleteById(vendor_id);
	        return "Vendor id: "+vendor_id+" is deleted";
	    }



}
