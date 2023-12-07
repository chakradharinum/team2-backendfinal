package com.ascend.pgp.capstone.team2backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
public class Team2BackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(Team2BackendApplication.class, args);
	}

}
