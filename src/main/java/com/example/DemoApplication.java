package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

      int a=10;
      double d=20.3;

	char c='c';

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
