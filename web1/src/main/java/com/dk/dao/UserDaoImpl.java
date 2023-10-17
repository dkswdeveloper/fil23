package com.dk.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.dk.config.DbConnection;
import com.dk.model.User;

public class UserDaoImpl implements UserDao{

	@Override
	public User findById(String username) {
		String sql = "select * from user where username=?";
		try {
			PreparedStatement pst = DbConnection.getConnection().prepareStatement(sql);
			pst.setString(1, username);
			ResultSet resultSet = pst.executeQuery();
			if(resultSet.next()) {
				String pass = resultSet.getString("password");
				User user = new User(username, pass);
				return user;
			}
			else return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}

}
