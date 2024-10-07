package com.rahuMohan.testingSpringDemo;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class TestingSpringDemoApplication {

	public static void main(String[] args) {
//		SpringApplication.run(TestingSpringDemoApplication.class, args);
		System.out.println("Welcome ! please use a size of table");
		Scanner scanner = new Scanner(System.in);
		String size = scanner.nextLine();
		if(size.equals("long")) {
			System.out.println("long table");
		}else {
			System.out.println("short table");
		}
	}

}
