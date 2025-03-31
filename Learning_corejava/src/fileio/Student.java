package fileio;

import java.io.Serializable;

public class Student implements Serializable {

	int id=11;
	String name="tops";
	transient String email="tops@gmial.com";
	
	
	public void display()
	{
		System.out.println(id+" "+name+" "+email);
	}
}
