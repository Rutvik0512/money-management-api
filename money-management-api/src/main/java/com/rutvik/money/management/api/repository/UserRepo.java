package com.rutvik.money.management.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rutvik.money.management.api.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	Optional<User> findByEmail(String email);
	
}
