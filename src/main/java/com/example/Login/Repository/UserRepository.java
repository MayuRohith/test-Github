package com.example.Login.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Login.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
