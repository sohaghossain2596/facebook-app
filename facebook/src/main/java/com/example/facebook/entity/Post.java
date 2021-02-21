package com.example.facebook.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Post {
@Id
private long id;
private String postDetail;

@OneToMany
@JoinColumn(name="COMMENT_ID")
private List<Comment> comment;

@ManyToOne
@JoinColumn(name="USER_ID")
private User user;

public Post(long id, String postDetail, List<Comment> comment) {
	super();
	this.id = id;
	this.postDetail = postDetail;
	this.comment = comment;
}
public Post() {}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getPostDetail() {
	return postDetail;
}

public void setPostDetail(String postDetail) {
	this.postDetail = postDetail;
}

public List<Comment> getComment() {
	return comment;
}

public void setComment(List<Comment> comment) {
	this.comment = comment;
}

}
