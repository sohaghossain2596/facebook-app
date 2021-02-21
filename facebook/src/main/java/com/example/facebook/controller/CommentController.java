package com.example.facebook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.facebook.entity.Comment;
import com.example.facebook.repository.CommentRepository;

@RestController
public class CommentController {
@Autowired
private CommentRepository commentrepository;// vul typeing

//comment insert  api bana
@PostMapping("/comment/create")
public Comment saveComment(@RequestBody Comment comment){
return 	 commentrepository.save(comment);
}

//find all ta 
@GetMapping("/comments")
public List<Comment> getAllComment(){
	return commentrepository.findAll();
}
@GetMapping("/comment/{id}")
public Comment getCommentId(@PathVariable long id) {//aktu wait kor.ok
	return commentrepository.findById(id);
}
}