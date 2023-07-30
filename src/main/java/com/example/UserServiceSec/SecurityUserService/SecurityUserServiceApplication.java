package com.example.UserServiceSec.SecurityUserService;

import com.example.UserServiceSec.SecurityUserService.Model.User;
import com.example.UserServiceSec.SecurityUserService.RepoSitory.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SecurityUserServiceApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SecurityUserServiceApplication.class, args);
	}

	@Autowired
	UserRepository repo;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User("mavin","$2a$10$NxGxEBAfIyDkqHSlHN/id.3uY62FyXr7grfk8jBe/IQlLdEGgTfUG",true,"admin,student");
		User user2 = new User("mani","$2a$10$3IZ1YpDuGoDKTDu0fE7MAOzi42c12XS4Wv7WfBL46KXoaF8O0Yr6m",true,"student");
		repo.save(user1);
		repo.save(user2);

	}
}
