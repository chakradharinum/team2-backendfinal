package com.ascend.pgp.capstone.team2backend.model;


import java.math.BigInteger;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("Category")
public class Category {

	private String category;

}
