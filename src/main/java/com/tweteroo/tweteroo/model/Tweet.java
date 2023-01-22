package com.tweteroo.tweteroo.model;

import com.tweteroo.tweteroo.DTO.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tweets")
@NoArgsConstructor
public class Tweet {
    public Tweet(TweetDTO data) {
        this.username = data.username();
        this.tweet = data.tweet();
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 200, nullable = false)
    private String username;

    @Column(length = 200, nullable = false)
    private String tweet;
}
