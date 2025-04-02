package collection;

import java.util.Enumeration;
import java.util.Vector;

public class C005_Vector {
	public static void main(String[] args) {
		
		Vector<Integer> v = new Vector<Integer>();
		v.addElement(10);
		v.addElement(20);
		v.addElement(30);
		
		
		Enumeration<Integer> enm = v.elements();
		while(enm.hasMoreElements())
		{
			System.out.println(enm.nextElement());
		}
		
	}
}
