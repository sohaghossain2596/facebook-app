package com.example.facebook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.facebook.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	// amara user search korbo email and passowd diya
	
//akane = er por ?1 mane holo parameter value 1. mane email
	//method er nam dilam kajer sate mil reke. jekon nam deya jabe
	// AND operation mane email o password mil thakte hobe.
	// akta mill na hole false. 

	@Query("select u from User u where u.email=?1 and u.password=?2")
	public User findUserByEmailAndPassword(String email, String password);
	
	@Query("select u from User u where u.id=?1")// akane find user by id
	public User findUserById(long id);
	
	//find user by name/
   @Query("select u from User u where u.name=?1")
   public User findUserByName(String name);//ok api bana. controller a api bana. naile kemne data pabi
   
   @Query("select u from User u where u.email=?1")//
   public User findUserByEmail(String email);
}
