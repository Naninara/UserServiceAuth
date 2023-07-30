package com.example.UserServiceSec.SecurityUserService.RepoSitory;

import com.example.UserServiceSec.SecurityUserService.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUserName(String name);
}
