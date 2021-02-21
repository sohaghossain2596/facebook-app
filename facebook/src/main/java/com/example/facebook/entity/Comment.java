package com.example.facebook.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Comment {
@Id
private long id;
private String commentDetail;

@ManyToOne
@JoinColumn(name="USER_ID")
private User user;

public Comment(long id, String commentDetail, User user) {
	super();
	this.id = id;
	this.commentDetail = commentDetail;
	this.user = user;
}

public Comment() {}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getCommentDetail() {
	return commentDetail;
}

public void setCommentDetail(String commentDetail) {
	this.commentDetail = commentDetail;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}


}
