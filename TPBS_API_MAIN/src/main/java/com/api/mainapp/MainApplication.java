package com.api.mainapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

import com.api.controller.TrainerController;

@SpringBootApplication
@ComponentScan(basePackageClasses = TrainerController.class, basePackages = "com.api.controller")
public class MainApplication extends SpringBootServletInitializer{
	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

}
