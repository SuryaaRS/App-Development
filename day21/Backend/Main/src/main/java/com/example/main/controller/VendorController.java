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
import com.example.main.entity.Vendor;
import com.example.main.service.VendorService;

@RestController
@RequestMapping("/vendor")
public class VendorController {
	@Autowired
	VendorService vs;
	

	@PostMapping("/postvendor")
	public ResponseEntity<String> postVendorDetails(@RequestBody Vendor f1) {
	      vs.postVendorDetails(f1);
	        return ResponseEntity.ok().build();
	    }

	@GetMapping("/getAllVendor")
	public ResponseEntity<List<Vendor>> readVendor()
	{
		List<Vendor> vendor=vs.readVendor();
		return ResponseEntity.ok(vendor);
	}

		
	@PutMapping("/changevendor/{vendor_id}")
	public Vendor updateVendor(@RequestBody Vendor c1)
	{
		return vs.updateVendor(c1);
	}

	@DeleteMapping("/delvendorbyid/{vendor_id}")
	public ResponseEntity<String> deletevendorDetails(@PathVariable ("vendor_id") int vendor_id) {
        try {
            vs.deletevendorDetails(vendor_id);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
	}
}
