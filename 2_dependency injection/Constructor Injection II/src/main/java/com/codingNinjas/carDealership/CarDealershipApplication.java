package com.codingNinjas.carDealership;

import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CarDealershipApplication {

	public static void main(String[] args) {
//		SpringApplication.run(CarDealershipApplication.class, args);
		
		//1) to config your spring XML context;
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2) take user inputs.
		Scanner scanner = new Scanner(System.in);
		// take users name
		System.out.println("Hi, please enter your name");
		String name = scanner.nextLine();
		
		System.out.println("please select your car of choice");
		System.out.println("1) family car \n 2)sports car \n 3)Truck");
		int type = scanner.nextInt();
		
		Car car = null;
		
		switch (type) {
		case 1: {
			car = (Car)context.getBean("familyCar");
			break;
 		}
		case 2: {
			car = (Car)context.getBean("sportsCar");
			break;
		}
		case 3: {
			car=(Car)context.getBean("truck");
			break;
		}
		default:
			System.out.println("wrong!");
		}
		
		car.setOwnerName(name);
		System.out.println(car.getOwnerName()+" owns "+car.getInfo());
	}

}
