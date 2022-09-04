package com.halilaydin242188.springbootcampcase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.halilaydin242188.springbootcampcase.model.Productcomment;
import com.halilaydin242188.springbootcampcase.repository.ProductcommentRepository;

@RestController
@RequestMapping(path = "/api/productcomments")
public class ProductcommentController {

    @Autowired
    private ProductcommentRepository productcommentRepository;

    @GetMapping(path = "/all")
    public List<Productcomment> getAll() {
        return productcommentRepository.findAll();
    }

    @GetMapping(path = "/byProductId/{productId}")
    public List<Productcomment> getByProductId(@PathVariable Long productId) {

        return productcommentRepository.findByProductId(productId);
    }

    @GetMapping(path = "/byUserId/{userId}")
    public List<Productcomment> getByUserId(@PathVariable Long userId) {

        return productcommentRepository.findByUserId(userId);
    }
}
