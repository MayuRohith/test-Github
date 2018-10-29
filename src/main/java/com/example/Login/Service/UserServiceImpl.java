package com.example.Login.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Login.Entity.User;
import com.example.Login.Repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	UserRepository userRepository;
	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public boolean addUser(User user) {
		User testUser = userRepository.save(user);
		if(testUser != null) {
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUser(User user, Integer id) {
		User existUser =userRepository.getOne(id);
		if(existUser.getUserId()!=null) {
			user.setUserId(id);
			userRepository.save(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(Integer id) {
	userRepository.deleteById(id);
		return true;
	}

}
