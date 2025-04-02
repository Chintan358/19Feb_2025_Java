package collection;

import java.util.ArrayList;
import java.util.Collections;

public class C008_StudentCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Student> st  = new ArrayList<Student>();
		st.add(new Student(2, "Sitesh", "abc@gmail.com"));
		st.add(new Student(3, "Monil", "xyz@gmail.com"));
		st.add(new Student(1, "Ronak", "pqr@gmail.com"));
		
	    Collections.sort(st);
		
		for(Student s : st)
		{
			System.out.println(s);
//			s.display();
		}
		
		
		
	}
}
