package com.example.demo;

import java.util.Scanner;

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
		
	/*	Scanner keyboard = new Scanner(System.in);

		String sss = "";
		
		while(true) {
			System.out.println("Type something");
			sss = keyboard.next();
			switch(sss) {
			default:
				System.out.println("You typed:" +sss);
			}
		}*/
		
	}

}
