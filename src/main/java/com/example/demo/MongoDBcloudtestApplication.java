package com.example.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.http.HttpClient;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan("com.controller")
@EnableMongoRepositories("com.persistance")
public class MongoDBcloudtestApplication {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(MongoDBcloudtestApplication.class, args);
		
		
	}

}
