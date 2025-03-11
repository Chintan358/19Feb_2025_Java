package oops;

class Pen
{
    String color="Red";
	String company="Cello";
	static int price=500;
	
	public void toWrite()
	{
		System.out.println(color+" "+company+" "+price);
	}
	
	static public void display()
	{
		System.out.println("runing display");
	}
}

public class O001_ClassDemo {
	public static void main(String[] args) {
		
		
		
		Pen p1 = new Pen();
		p1.color="Black";
		p1.toWrite();
		
		Pen.price=800;
		Pen p2 = new Pen();
		p2.toWrite();
		
		Pen p3 = new Pen();
		p3.toWrite();
		
		
		Pen.display();
		
	}
}
