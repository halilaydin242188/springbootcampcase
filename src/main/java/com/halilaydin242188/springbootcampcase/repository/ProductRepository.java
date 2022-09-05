package com.halilaydin242188.springbootcampcase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.halilaydin242188.springbootcampcase.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query(nativeQuery = true, value = "SELECT * FROM products AS p WHERE p.expiration_date < CURRENT_TIMESTAMP")
    List<Product> findExpiredProducts();

    @Query(nativeQuery = true, value = "SELECT * FROM products AS p WHERE p.expiration_date IS NULL OR p.expiration_date > CURRENT_TIMESTAMP")
    List<Product> findNotExpiredProducts();
}
