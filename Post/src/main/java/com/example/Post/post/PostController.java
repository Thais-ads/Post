package com.example.Post.post;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    PostRepository repository;

    @GetMapping
    @Cacheable("posts")
    public ResponseEntity<List<Post>> index(){
        return ResponseEntity.ok(repository.findAll());
    }
    
    @PostMapping
    @CacheEvict(value = "posts", allEntries = true)
    public ResponseEntity<Post> create(@RequestBody Post post){
        repository.save(post);
        return ResponseEntity.status(201).body(post);
    }

}
