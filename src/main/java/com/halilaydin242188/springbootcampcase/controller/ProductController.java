package com.halilaydin242188.springbootcampcase.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/byExpirationDateLessThanNow")
    public List<Product> getByExpirationDateLessThanNow() {

        return productRepository.findByExpirationDateLessThanNow();
    }
}
