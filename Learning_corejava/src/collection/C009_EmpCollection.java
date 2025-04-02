package collection;

import java.util.ArrayList;
import java.util.Collections;

public class C009_EmpCollection {
	public static void main(String[] args) {
		
		
		ArrayList<Employee> emp = new ArrayList<Employee>();
		emp.add(new Employee(2, "Kanha", "abc@gmail.com"));
		emp.add(new Employee(1, "Shiv", "ss@gmail.com"));
		emp.add(new Employee(4, "Aitesh", "xyz@gmail.com"));
		
		Collections.sort(emp,new SortEmpByName());
		
		for(Employee e : emp)
		{
			e.display();
		}
		
		
		
		
		
	}
}
