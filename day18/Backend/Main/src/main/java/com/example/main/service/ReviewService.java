package com.example.main.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.main.entity.Review;
import com.example.main.repository.ReviewRepository;

@Service
public class ReviewService {
	@Autowired
	ReviewRepository rr;
	
	
	public String  postReviewDetails(Review c1)
	{
		  rr.save(c1);
		  return "Review Details are saved";
	}
	public List<Review> readReview()
	{
		return rr.findAll();
	}
	public Review updateReview(Review c1)
 	{
 		System.out.println("Changes updated");
 		return rr.save(c1);
 	}
	public String deletereviewDetails(@PathVariable("reviewid") int reviewid)
	{
		     rr.deleteById(reviewid);
	 		 return "This id: "+reviewid+" is deleted";
	}

}
