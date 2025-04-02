package collection;

import java.util.Comparator;

public class SortEmpById  implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) 
	{
		int i = 0;
		
		if(o1.id<o2.id)
		{
			i=-1;
		}
		else if(o1.id>o2.id)
		{
			i = 1;
		}
		else
		{
			i = 0;
		}
		
		return i;
	}

}
