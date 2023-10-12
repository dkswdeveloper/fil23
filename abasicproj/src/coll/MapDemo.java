package coll;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class MapDemo {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		// key value pair
		System.out.println(map.put("amit", 34));
		map.put("sumit", 87);
		map.put("rajan", 56);
		map.put("keerti", 56);
		map.put("anu", 12);
		map.put("anu", 22);
		System.out.println(map);
		System.out.println(map.get("anu"));
		//		map.clear(); //delete all values 
		HashMap<String, String> hmap = new HashMap<>();
		hmap.values();
		Set<String> keys = map.keySet();
		for(String key : keys)
		{
			Integer value = map.get(key);
			System.out.println(key + ":" + value);
		}
		Collection<Integer> values = map.values();
		//read 10 names from keyboard
		//		amit sumit rajan anu anuj ananya keerti krishan tanu ankit
		//		a -> amit anu anuj ananya ankit
		//		r -> rajan
		//		s -> sumit
		//		k -> keerti krishan
		//		t -> tanu
		Map<Character, List<String>> nameMap = new HashMap<>();
		Scanner sc =new Scanner(System.in);
		for(int i = 0; i < 10; i++)
		{
			String word = sc.next();
			char ch = Character.toLowerCase(word.charAt(0));
			if(nameMap.containsKey(ch))
			{
				List<String> list = nameMap.get(ch);
				list.add(word);
			}
			else
			{
				List<String> list =new ArrayList<>();
				list.add(word);
				nameMap.put(ch, list);
			}
		}
		System.out.println(nameMap);

		// in the string = "this is a string" find the frequency of each
		//character t=2, h=1, i=3, s=3 ... using a map
		//find the character(s) with max frequency 
		//Get the map.entrySet and sort the set using the frequency
		String str = "this is a string";
		Map<Character,Integer> freqmap = new HashMap<>();
		for(char ch : str.toCharArray())
		{
			if(freqmap.containsKey(ch))
			{
				int f = freqmap.get(ch);
				freqmap.put(ch, f+1);
			}
			else
			{
				freqmap.put(ch, 1);
			}
		}
		System.out.println(freqmap);
		


	}

}
