package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a servlet container and host the app in that serverlet continer
		
		SpringApplication.run(CourseApiApp.class, args); // args is the arguments that we need to start for the class
		

	}

}
