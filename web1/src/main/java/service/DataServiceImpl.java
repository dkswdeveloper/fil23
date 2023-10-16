package service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataServiceImpl implements DataService {
	static Map<String, List<String>> map = new HashMap<>();
	static
	{
		map.put("dinesh", Arrays.asList("msg1", "msg2"));
		map.put("ankit", Arrays.asList("holiday", "gaming"));
		map.put("tanu", Arrays.asList("lunch", "tea"));
		
	}
	@Override
	public List<String> getData(String username) {
		List<String> list = map.get(username);
		System.out.println("service returing " + list);
		
		return list;
	}

}
