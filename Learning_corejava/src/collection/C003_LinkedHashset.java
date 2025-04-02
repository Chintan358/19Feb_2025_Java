package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class C003_LinkedHashset {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
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
