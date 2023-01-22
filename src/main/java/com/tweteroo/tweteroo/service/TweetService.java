package com.tweteroo.tweteroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tweteroo.tweteroo.DTO.TweetDTO;
import com.tweteroo.tweteroo.model.Tweet;
import com.tweteroo.tweteroo.repository.TweetRepository;

@Service
public class TweetService {
    
    @Autowired
    private TweetRepository repository;

    public void save(TweetDTO req) {
        repository.save(new Tweet(req));
    }
}
