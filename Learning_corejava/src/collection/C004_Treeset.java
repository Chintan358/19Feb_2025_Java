package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class C004_Treeset {
	public static void main(String[] args) {
		
		
		TreeSet<String> set = new TreeSet<String>();
		set.add("Java");
		set.add("Php");
		set.add("Android");
		set.add("Java");
		set.add("Node");
		
		
		//Iterator<String> itr = set.iterator();
		Iterator<String> itr = set.descendingIterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
}
