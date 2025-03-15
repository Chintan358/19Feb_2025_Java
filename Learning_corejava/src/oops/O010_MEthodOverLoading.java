package oops;

class Calc1
{
	public void add(int a, int b)
	{
		int r = a+b;
		System.out.println("Result is 1: "+r);
	}
	
	public void add(int a, int b,int c)
	{
		int r = a+b+c;
		System.out.println("Result is 2: "+r);
	}
	
	public void add(int a, double b)
	{
		double r = a+b;
		System.out.println("Result is 3: "+r);
	}
}

public class O010_MEthodOverLoading {
	public static void main(String[] args) {
			
		Calc1 c  = new Calc1();
		c.add(10, 20);
		c.add(10, 20, 90);
		c.add(20, 50.23);
		
	}
	
}
