package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Farmer;


public interface FarmerRepo extends JpaRepository<Farmer ,Integer>{
	

}
