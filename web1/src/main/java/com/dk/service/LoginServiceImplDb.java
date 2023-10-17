package com.dk.service;

import com.dk.dao.UserDao;
import com.dk.dao.UserDaoImpl;
import com.dk.model.User;

public class LoginServiceImplDb implements LoginService{

	UserDao userDao = new UserDaoImpl();
	@Override
	public boolean checkLogin(String username, String password) {
		User user = userDao.findById(username);
		if(user == null) return false;
		return user.getPassword().equals(password);
	}

}
