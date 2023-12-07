package com.ascend.pgp.capstone.team2backend.repository;


import java.math.BigInteger;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.ascend.pgp.capstone.team2backend.model.Product;


@Repository
public interface ProductRepository extends MongoRepository<Product, BigInteger> {

	@Query("{productName:'?0'}")
	Product findProductByName(String pname);

	@Query("{productCategory:'?0'}")
	List<Product> findByProductCategory(String pcategory);

	@Query("{title:{$regex:'?0'}}, {productName:{$regex:'?0'}}}")
	List<Product> findProductsByTitleAndName(String searchCriterion);
	
	@Query("{title:{$regex:'?0'}}, {productName:{$regex:'?0'}}, {shortDescription:{$regex:'?0'}}}")
	List<Product> findProductsByTitleNameOrShortDesc(String searchCriterion);

	@Query("{}")
	List<Product> getAllProducts();

}
