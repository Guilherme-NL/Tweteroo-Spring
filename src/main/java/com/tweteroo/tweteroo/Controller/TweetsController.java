package com.tweteroo.tweteroo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tweteroo.tweteroo.DTO.TweetDTO;
import com.tweteroo.tweteroo.model.Tweet;
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

    @GetMapping("/{username}")
    public ResponseEntity<List<Tweet>> listUserTweets(@PathVariable String username) {
        var userTweets = service.findUserTweets(username);
        if(userTweets != null) {
            return ResponseEntity.ok().body(userTweets);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public Page<Tweet> getTweetsPage(@PageableDefault(page = 0, size = 5) Pageable page) {
        return service.findAll(page);
    }
    
}
