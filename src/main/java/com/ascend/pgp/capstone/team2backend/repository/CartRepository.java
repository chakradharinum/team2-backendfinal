package com.ascend.pgp.capstone.team2backend.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ascend.pgp.capstone.team2backend.model.Cart;


public interface CartRepository extends MongoRepository<Cart, BigInteger> {

	@Query("{}")
	List<Cart> getAllItemsInCart();
	
	@Query("{itemId:'?0'}")
	Cart getItemInCart(BigInteger itemId);

}
