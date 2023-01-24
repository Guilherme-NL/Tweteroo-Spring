package com.tweteroo.tweteroo.service;

import java.util.List;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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

    public List<Tweet> findUserTweets(String username) {
        //@Query("SELECT * FROM tweets", []);
        return repository.findAll();
        //repository.find
    }

    public Page<Tweet> findAll(Pageable pageable) {
        int page = Integer.parseInt(pageable.getPageParameter());
        int size = Integer.parseInt(pageable.getSizeParameter());
        PageRequest pageRequest = PageRequest.of(page, size);

        return new PageImpl<>(repository.findAll(), pageRequest, size);
    }
}
