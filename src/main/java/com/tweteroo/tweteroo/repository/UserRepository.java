package com.tweteroo.tweteroo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByUsername(String username);
}
