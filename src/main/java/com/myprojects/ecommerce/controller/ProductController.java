package com.myprojects.ecommerce.controller;

import com.myprojects.ecommerce.model.Product;
import com.myprojects.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/uploadProduct")
    public String uploadProduct(@RequestBody Product product) {
        return productService.uploadProduct(product);
    }
}
