package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.controller")
@EnableMongoRepositories("com.persistance")
public class MongoDBcloudtestApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongoDBcloudtestApplication.class, args);
	}

}
