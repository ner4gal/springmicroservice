package com.algotechnica.springmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.algotechnica.springmicroservice.entities.Vendor;

@SpringBootApplication
public class SpringmicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringmicroserviceApplication.class, args);

		Vendor vendor = new Vendor();
	}

}
