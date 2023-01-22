package com.tweteroo.tweteroo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.DTO.TweetDTO;
import com.tweteroo.tweteroo.service.TweetService;

@RestController
@RequestMapping("/api/tweets")
public class TweetsController {

    @Autowired
    private TweetService service;

    @PostMapping
    public ResponseEntity<String> CreateTweet(@RequestBody TweetDTO req){
        service.save(req);
        return ResponseEntity.ok().body("OK");
    }
    
}
