package com.srv.aws.ecs.springbootdockerawsecs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/")
public class SpringbootDockerAwsEcsApplication {

	@GetMapping
	public String applicationStatus(){
		return "Up & Running !";
	}

	@GetMapping("/{name}")
	public String welcome(@PathVariable String name){
		return "Hi " + name + " This is Spring Boot App using AWS ECS";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDockerAwsEcsApplication.class, args);
	}

}
