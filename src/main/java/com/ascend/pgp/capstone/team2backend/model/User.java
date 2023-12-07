package com.ascend.pgp.capstone.team2backend.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document("User")
public class User {

	private String email;
	private String password;
	private String avtar;
	private String[] favoriteCategories;

}