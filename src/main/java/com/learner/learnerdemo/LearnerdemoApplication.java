package com.learner.learnerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
//@EnableKafka
public class LearnerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnerdemoApplication.class, args);
	}
}
