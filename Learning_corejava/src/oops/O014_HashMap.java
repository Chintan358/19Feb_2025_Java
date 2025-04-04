package oops;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class O014_HashMap {
	public static void main(String[] args) {
		
		
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("IN", "India");
		map.put("US", "USA");
		map.put("UK", "united kingdom");
		map.put("AUS", "Australia");
		map.put("IN", "Indonatia");
		
		//System.out.println(map);
		System.out.println(map.get("INf"));
		
//		Set s  =map.entrySet();
//		
//		Iterator itr = s.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		for(Entry<String, String> m : map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}
}
