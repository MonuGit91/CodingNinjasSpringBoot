package com.codingNinjas.SocialMedia;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SocialMediaApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SocialMediaApplication.class, args);
		// get the context from the xml
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Post post = (Post) context.getBean("simplePost");


	}

}
