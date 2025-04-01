package collection;

import java.util.ArrayList;
import java.util.Iterator;

public class C001_Arraylist {
	
	
		public static void main(String[] args) {
			
			//default size : 10
			//new size = oldsize*3/2 +1 = 10*3/2 + 1 = 16
			ArrayList<String> al = new ArrayList<String>();
			al.add("Java");
			al.add("php");
			al.add("android");
			al.add(".net");
			
//			al.add(1,"Python");
//			al.set(1,"Python");
//			al.remove(1);
//			System.out.println(al.size());
			
//			for(String s : al)
//			{
//				System.out.println(s);
//			}
//			
//			System.out.println(al.get(2));
			
			
			
			ArrayList list = new ArrayList();
			list.add(10);
			list.add("test");
			list.add('A');
			list.add(12.36);
			list.addAll(al);
			
//			for(Object o : list)
//			{
//				System.out.println(o);
//			}
			
			
			Iterator<Object> itr = list.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
		}
}
