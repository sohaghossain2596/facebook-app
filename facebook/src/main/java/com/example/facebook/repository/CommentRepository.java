package com.example.facebook.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
@Query("select c from Comment c")
public List<Comment> findAllComment();//alreay ache

@Query("select c from Comment c where c.id=?1")
public Comment findById(long id);//ai ta home work. kore rakbi
//fb check kore homework kore rakbi

}
