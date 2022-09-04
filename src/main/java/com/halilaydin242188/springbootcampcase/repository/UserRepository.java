package com.halilaydin242188.springbootcampcase.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.halilaydin242188.springbootcampcase.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
