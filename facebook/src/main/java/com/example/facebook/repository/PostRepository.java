package com.example.facebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.Post;
import com.example.facebook.entity.User;

@Repository
public interface PostRepository extends JpaRepository<Post,Long> {

@Query("select p from Post p")	// Areturn korbi many posts
public List<Post> findAllPost();

@Query("select p from Post p where p.id=?1")// akane find user by id
public Post findPostById(long id);//all time save all files
}
