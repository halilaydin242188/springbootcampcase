package com.halilaydin242188.springbootcampcase.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.halilaydin242188.springbootcampcase.model.Productcomment;
import com.halilaydin242188.springbootcampcase.repository.ProductcommentRepository;

@RestController
@RequestMapping(path = "/api/productcomment")
public class ProductcommentController {

    @Autowired
    private ProductcommentRepository productcommentRepository;

    @GetMapping(path = "/byProductId/{productId}")
    public List<Productcomment> getByProductId(@PathVariable Long productId) {

        return productcommentRepository.findByProductId(productId);
    }

    @GetMapping("/byProductIdBetweenDates")
    public List<Productcomment> getByProductBetweenDates(@RequestParam("productId") Long productId,

            @RequestParam("startDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,

            @RequestParam("endDate") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        return productcommentRepository.findByProductBetweenDates(productId,
                startDate, endDate);
    }

    @GetMapping(path = "/byUserId/{userId}")
    public List<Productcomment> getByUserId(@PathVariable Long userId) {

        return productcommentRepository.findByUserId(userId);
    }

}
