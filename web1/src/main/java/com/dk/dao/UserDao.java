package com.dk.dao;

import com.dk.model.User;

public interface UserDao {
	
	User findById(String username);

}
