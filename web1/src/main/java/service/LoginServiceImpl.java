package service;

import java.util.HashMap;
import java.util.Map;

public class LoginServiceImpl implements LoginService {
//	UserDao userDao = new UserDaoImpl();
	static Map<String,String> users = new HashMap<>();
	static
	{
		users.put("dinesh", "dineshpass");
		users.put("tanu","tanupass");
		users.put("ankit", "ankitpass");
	}

	@Override
	public boolean checkLogin(String username, String password) {
		if(users.containsKey(username))
			return users.get(username).equals(password);
		return false;
	}

}
