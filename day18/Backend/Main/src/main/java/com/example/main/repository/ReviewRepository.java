package com.example.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.main.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

}
