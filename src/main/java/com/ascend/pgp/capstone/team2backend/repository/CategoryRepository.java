package com.ascend.pgp.capstone.team2backend.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ascend.pgp.capstone.team2backend.model.Category;

public interface CategoryRepository  extends MongoRepository<Category, BigInteger> {
	
    @Query("{}")
    List<Category> getAllCategories();

}
