package com.technoelevate.copy.prop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.technoelevate.copy.prop.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
