package com.cint.githubactiondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GithubActionDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubActionDemoApplication.class, args);
		System.out.println("--github actions--");
	}

}
