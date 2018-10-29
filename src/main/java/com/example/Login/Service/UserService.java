package com.example.Login.Service;

import java.util.List;

import com.example.Login.Entity.User;

public interface UserService {
List<User> getAllUser();
boolean addUser(User user);
boolean updateUser(User user, Integer id);
boolean deleteUser(Integer id);

}
