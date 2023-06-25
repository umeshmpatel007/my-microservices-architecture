package com.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class DepartmentServiceApplication {


	public static void main(String[] args) {
		System.out.println("------------"+Runtime.getRuntime().availableProcessors());
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}
