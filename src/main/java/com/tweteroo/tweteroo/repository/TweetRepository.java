package com.tweteroo.tweteroo.repository;

import java.util.List;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tweteroo.tweteroo.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {
}