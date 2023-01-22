package com.tweteroo.tweteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    
}