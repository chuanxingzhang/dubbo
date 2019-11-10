package com.start.zkconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ZkconsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZkconsumerApplication.class, args);
	}

}
