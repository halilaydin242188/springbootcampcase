package com.halilaydin242188.springbootcampcase.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.halilaydin242188.springbootcampcase.model.Productcomment;

public interface ProductcommentRepository extends JpaRepository<Productcomment, Long> {

    List<Productcomment> findByProductId(@Param("id") Long id);

    List<Productcomment> findByUserId(@Param("id") Long id);
}
