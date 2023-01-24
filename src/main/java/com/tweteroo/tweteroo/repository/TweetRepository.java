package com.tweteroo.tweteroo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.tweteroo.tweteroo.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
    List<Tweet> findByUsername(String username);
}