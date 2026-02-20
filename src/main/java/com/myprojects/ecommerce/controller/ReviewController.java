package com.myprojects.ecommerce.controller;

import com.myprojects.ecommerce.model.Review;
import com.myprojects.ecommerce.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping("/{product_id}/{user_id}/addReview")
    public Review addReview(
            @RequestBody Review review,
            @PathVariable Long product_id,
            @PathVariable Long user_id
    ){
        return reviewService.addReview(user_id,product_id,review);
    }
}
