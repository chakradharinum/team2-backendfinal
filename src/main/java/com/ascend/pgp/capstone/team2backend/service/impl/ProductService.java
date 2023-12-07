package com.ascend.pgp.capstone.team2backend.service.impl;

import java.util.List;

import org.springframework.context.annotation.Bean;

import com.ascend.pgp.capstone.team2backend.model.Cart;
import com.ascend.pgp.capstone.team2backend.model.Category;
import com.ascend.pgp.capstone.team2backend.model.Product;
import com.ascend.pgp.capstone.team2backend.model.User;
import com.ascend.pgp.capstone.team2backend.model.Wishlist;


public interface ProductService {

	public Product getProductByName(String pname);

	public List<Product> getAllProductByCategory(String pcategory);

	public User getUserByEmail(String uemail);

	public List<Category> getallCategory();

	public List<Product> getProductsByTitleAndName(String searchCriterion);

	public List<Product> getProductsByTitleNameOrShortDesc(String searchCriterion);

	public List<Product> getAllProducts();

	public List<Cart> getAllItemsInCart();

	public List<Wishlist> getAllItemsInWishlist();
	
	public void addItemToWishlist(String itemId);
	
	public void deleteItemFromWishlist(String itemId);
	
	public void addItemToCart(String itemId);
	
	public void deleteItemFromCart(String itemId);
	
	public void reduceQuantityForItemInCart(String itemId);
	
}