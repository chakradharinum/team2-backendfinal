package com.ascend.pgp.capstone.team2backend.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ascend.pgp.capstone.team2backend.model.User;



public interface UserRepository extends MongoRepository<User, String> {
	
    
    @Query("{email:'?0'}")
    User checkUserInfo(String uemail);


}
