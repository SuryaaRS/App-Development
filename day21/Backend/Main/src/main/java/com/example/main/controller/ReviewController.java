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
import com.example.main.entity.Review;
import com.example.main.service.ReviewService;

@RestController
@RequestMapping("/review")
public class ReviewController {
	@Autowired
	ReviewService rs;
	
	@PostMapping("/postreview")
	public ResponseEntity<String> postReviewDetails(@RequestBody Review r1) {
	      rs.postReviewDetails(r1);
	        return ResponseEntity.ok().build();
	    }
	
	@GetMapping("/getreview")
	public ResponseEntity<List<Review>> readReview()
	{
		List<Review> review=rs.readReview();
		return ResponseEntity.ok(review);
	}
		
	@PutMapping("/changereview/{reviewid}")
	public Review updateReview(@RequestBody Review p1)
	{
		return rs.updateReview(p1);
	}
	
	@DeleteMapping("/delreview/{reviewid}")
	 public ResponseEntity<String> deletereviewDetails(@PathVariable ("reviewid") int reviewid) {
        try {
            rs.deletereviewDetails(reviewid);
            return ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }
}
