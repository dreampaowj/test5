package com.example.test5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.test5.service")
@EnableElasticsearchRepositories(basePackages = "com.example.test5.elasticsearch")
public class Test5Application {

	public static void main(String[] args) {
		SpringApplication.run(Test5Application.class, args);
	}

}
