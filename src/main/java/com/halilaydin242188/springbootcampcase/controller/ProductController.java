package com.halilaydin242188.springbootcampcase.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halilaydin242188.springbootcampcase.repository.ProductRepository;

@RestController
@RequestMapping(path = "/api/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
}
