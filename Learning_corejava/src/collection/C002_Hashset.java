package collection;

import java.util.HashSet;
import java.util.Iterator;

public class C002_Hashset {
	public static void main(String[] args) {
		
		
		HashSet<String> set = new HashSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("Java");
		set.add("Node");
		
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
