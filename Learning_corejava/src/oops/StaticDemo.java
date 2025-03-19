package oops;

class State
{
	
	public State() {
		System.out.println("constructor calling...");
	}
	
	public void show()
	{
		System.out.println("running show");
	}
	
	{
		System.out.println("non-static block");
	}
	
	static
	{
		System.out.println("Calling static block");
	}
}

public class StaticDemo {
	
//	static {
//		System.out.println("static block calling");
//	}
	
	public static void main(String[] args) {
		
		State s = new State();
		s.show();
		System.out.println("Hello java");
		
	}
}
