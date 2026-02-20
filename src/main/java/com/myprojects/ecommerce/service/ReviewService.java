package com.myprojects.ecommerce.service;

import com.myprojects.ecommerce.model.Product;
import com.myprojects.ecommerce.model.Review;
import com.myprojects.ecommerce.model.User;
import com.myprojects.ecommerce.repository.ProductRepository;
import com.myprojects.ecommerce.repository.ReviewRepository;
import com.myprojects.ecommerce.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private UserRepository userRepository;

    public Review addReview(Long userId, Long productId, Review review) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found"));
        Product product = productRepository.findById(productId)
                .orElseThrow(() -> new RuntimeException("Product not found"));

        review.setUser(user);
        review.setProduct(product);

        return reviewRepository.save(review);

    }
}
