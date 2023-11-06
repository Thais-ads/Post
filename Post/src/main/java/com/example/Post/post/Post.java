package com.example.Post.post;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data    
public class Post {
    
    @Id @GeneratedValue(strategy =  GenerationType.IDENTITY)
    Long id;
    String title;
    String content;
    LocalDateTime createdAt = LocalDateTime.now();

}
