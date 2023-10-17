package com.dk.config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DbConnection {
	private static Connection connection = null;
	public static void  close()
	{
		try {
			DbConnection.getConnection().close();
			System.out.println("connection closed");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection()
	{
		return connection;
	}
	public static Connection getConnection(String url, String user, String pass)
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			if(connection == null || connection.isClosed())
			{
				MysqlDataSource dataSource = new MysqlDataSource();
				dataSource.setUrl(url);
				dataSource.setUser(user);
				dataSource.setPassword(pass);
				connection = dataSource.getConnection();
			}
			return connection;

		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}

}
