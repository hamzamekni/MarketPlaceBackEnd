package com.example.marketplace.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.marketplace.module.User;


@Repository
public interface UserRepo extends JpaRepository<User, String>{
    User findByUserId(String userId);
}
