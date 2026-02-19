package com.myprojects.ecommerce.service;

import com.myprojects.ecommerce.model.Product;
import com.myprojects.ecommerce.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public String uploadProduct(Product product) {
        productRepository.save(product);
        return "Product uploaded successfully";
    }
}
