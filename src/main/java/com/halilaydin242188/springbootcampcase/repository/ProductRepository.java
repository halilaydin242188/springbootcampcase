package com.halilaydin242188.springbootcampcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.halilaydin242188.springbootcampcase.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
