package com.mieker.prometheus;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrometheusApplication.class, args);
		System.out.println("hello");
	}

}
