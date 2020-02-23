package com.springboottest.springboottest.repository;

import com.springboottest.springboottest.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
