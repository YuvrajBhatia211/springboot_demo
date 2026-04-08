package com.example.springboot_demo;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootDemoApplication {

	public static void main(String[] args) {

		ApplicationContext contxt=SpringApplication.run(SpringbootDemoApplication.class, args);
		System.out.println("helo world");
		Alien alien =  contxt.getBean(Alien.class);
		alien.code();

		Alien alien2 =  contxt.getBean(Alien.class);
		alien2.code();


	}

}
