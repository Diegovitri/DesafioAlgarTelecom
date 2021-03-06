package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@EnableAutoConfiguration
@ComponentScan({"controller","service"})
public class Main {
	
	public static void main(String[] args) throws Exception{
		SpringApplication.run(Main.class, args);
	}
	
}