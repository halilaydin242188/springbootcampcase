package com.halilaydin242188.springbootcampcase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halilaydin242188.springbootcampcase.model.Product;
import com.halilaydin242188.springbootcampcase.repository.ProductRepository;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping(path = "/all")
    public List<Product> getAll() {

        return productRepository.findAll();
    }

    @GetMapping(path = "/expired")
    public List<Product> getExpiredProducts() {

        return productRepository.findExpiredProducts();
    }

    @GetMapping(path = "/notExpired")
    public List<Product> getNotExpiredProducts() {

        return productRepository.findNotExpiredProducts();
    }
}
