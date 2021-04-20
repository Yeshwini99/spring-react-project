package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@SpringBootApplication
public class SpringbootappApplication  implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootappApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		this.userRepository.save(new User("Yeshwini","Thulasi","yeshwinit@gmail.com"));
		this.userRepository.save(new User("Teju","Thulasi","teju@gmail.com"));
		this.userRepository.save(new User("Nandhini","Baskar","nandhini@gmail.com"));
		this.userRepository.save(new User("Dimple","Sivaji","dimples@gmail.com"));
		this.userRepository.save(new User("Rags","Kumar","ragskumar@gmail.com"));
				
	}

}
