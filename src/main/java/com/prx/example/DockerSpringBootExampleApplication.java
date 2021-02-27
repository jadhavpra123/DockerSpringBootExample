package com.prx.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerSpringBootExampleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(DockerSpringBootExampleApplication.class, args);
	}

}
