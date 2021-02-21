package com.example.facebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebook.entity.Post;
import com.example.facebook.repository.PostRepository;

@RestController
public class PostController {
@Autowired
private PostRepository postRepository;

@PostMapping("/post/create")// ki vul korsos check kor
public Post savePost(@RequestBody Post post) {
	return postRepository.save(post);
}
@GetMapping("/posts")
public List<Post> PostgetAll(){
	return postRepository.findAllPost();
}

@GetMapping("/post/{id}")//url hoy n ok. server run kor
public  Post getPostById(@PathVariable long id){// retutn korbi koyta
return 	postRepository.findPostById(id);//method call kora o vule gasos
}
}