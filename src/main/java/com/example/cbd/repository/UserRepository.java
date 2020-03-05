package com.example.cbd.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cbd.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
