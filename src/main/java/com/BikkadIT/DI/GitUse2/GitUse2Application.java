package com.BikkadIT.DI.GitUse2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitUse2Application {

	public static void main(String[] args) {
		SpringApplication.run(GitUse2Application.class, args);
		int a=10, b =80;
		int c;
		System.out.println("Sum of a and b is: "+(c=a+b));
	
		
	}

}
