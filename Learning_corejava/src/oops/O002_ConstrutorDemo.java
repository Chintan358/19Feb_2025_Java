package oops;

class Student
{
//	Student()
//	{
//		System.out.println("const calling...");
//	}
//	
//	Student(int a)
//	{
//		System.out.println("id : "+a);
//	}
//	
//	Student(String s)
//	{
//		System.out.println(s);
//	}
	
	int id;
	String name;
	
	Student(int id, String name)
	{
		this.id = id;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println(id+" "+name);
	}
	
}
public class O002_ConstrutorDemo {
	public static void main(String[] args) {
		
		
//		Student st = new Student();
//		Student st1 = new Student(10);
//		Student st2 = new Student("Hello");
		
		Student st = new Student(10,"Monil");
		st.display();
		
		Student st1 = new Student(20, "Sitesh");
		st1.display();
		
	}
}
