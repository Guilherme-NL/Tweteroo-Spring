package com.tweteroo.tweteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
