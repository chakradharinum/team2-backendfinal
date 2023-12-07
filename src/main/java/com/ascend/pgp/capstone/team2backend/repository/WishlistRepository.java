package com.ascend.pgp.capstone.team2backend.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ascend.pgp.capstone.team2backend.model.Wishlist;

public interface WishlistRepository extends MongoRepository<Wishlist, BigInteger> {

	@Query("{}")
	List<Wishlist> getAllItemsInWishlist();

}
