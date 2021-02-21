package com.example.facebook.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)// id auto generate korbe
private long id;
private String name;// ato vule jas keno. id diya jemne korsi. find user by name. query lek

@Column(name="email", unique=true)// email can not be duplicate. 
private String email;
private String password;//sob gula field name r value dibi postman body te. data dukanor janno

public long getId() {
	return id;
}
public User() {}

public void setId(long id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {// start hoiche
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}

 
//getter setter  default constru  vai constuctor dai nai

}
