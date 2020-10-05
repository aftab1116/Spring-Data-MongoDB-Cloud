package com.example.MongoDBDemo;

import com.example.MongoDBDemo.modal.User;
import com.example.MongoDBDemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class MongoDbDemoApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MongoDbDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User("12345", "uname", "pass", 1);
		userRepository.save(user);
		System.out.println(userRepository.findAll());
	}
}
