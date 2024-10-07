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
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Table longTable = (Table) context.getBean("longTable");
		Table shortTable = (Table) context.getBean("shortTable");
		if(size.equals("long")) {
			System.out.println(longTable.showDetails());
		}else {
			System.out.println(shortTable.showDetails());
		}
	}

}
