package com.halilaydin242188.springbootcampcase.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.halilaydin242188.springbootcampcase.model.Productcomment;

public interface ProductcommentRepository extends JpaRepository<Productcomment, Long> {

    List<Productcomment> findByProductId(@Param("id") Long id);

    List<Productcomment> findByUserId(@Param("id") Long id);

    @Query(nativeQuery = true, value = "SELECT * FROM product_comments AS pc WHERE pc.product_id = ?1 AND pc.comment_date BETWEEN ?2 AND ?3")
    List<Productcomment> findByProductIdAndBetweenDates(Long id, LocalDate startDate, LocalDate endDate);

    @Query(nativeQuery = true, value = "SELECT * FROM product_comments AS pc WHERE pc.user_id = ?1 AND pc.comment_date BETWEEN ?2 AND ?3")
    List<Productcomment> findByUserIdBetweenDates(Long id, LocalDate startDate, LocalDate endDate);
}
