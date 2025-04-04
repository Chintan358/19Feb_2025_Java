package oops;

import java.util.HashMap;

public class O015_WordAccorance {
	public static void main(String[] args) {
		
		
		String str = "Hello java Hello java python Hello";
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String words[] = str.split(" ");
		
		for(int i=0;i<words.length;i++)
		{
			
			if(map.get(words[i])==null)
			{
				map.put(words[i], 1);
				
			}
			else
			{
				int count = map.get(words[i]);
				count++;
				map.put(words[i], count);
				
			}
			
		}
		
		System.out.println(map);
		
	}
}
