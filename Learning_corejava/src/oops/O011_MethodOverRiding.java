package oops;

class K
{
	public void display()
	{
		System.out.println("runing K class display");
	}
}

class L extends K
{
	@Override
	public void display() {
		System.out.println("Runing L class display");
		super.display();
	}
}
public class O011_MethodOverRiding {
	public static void main(String[] args) {
		
		L l = new L();
		l.display();
		
		
	}
}
