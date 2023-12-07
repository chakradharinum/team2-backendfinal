package com.ascend.pgp.capstone.team2backend.model;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("products")
public class Product {

	@Id
	private BigInteger _id;
	private BigInteger id;
	private String title;
	private BigInteger minQuantity;
	private String gender;
	private String iconUrl;
	private String shortDescription;
	private String longDescription;
	private String productName;
	private String productCategory;
	private String inventryStatus;
	private BigInteger availableQuantity;
	private String purchasable;
	private String[] searchTags;
	private String model;
	private String brand;
	private String specification;
	private BigInteger warrantyDuration;
	private String[] imageUrls;
	private BigInteger orderLimit;
	private BigInteger returnDates;
	private BigInteger length;
	private BigInteger width;
	private BigInteger height;
	private double weight;
	private Object ratings;
	private Boolean isElegibileForPromotion;
	private BigInteger discount;
	private String isHazardous;
	private String isReturnable;

}

