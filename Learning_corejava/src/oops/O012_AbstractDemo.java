package oops;

abstract class Abs
{
	int a = 10;
	public abstract void display();
	
	public void run()
	{
		 System.out.println("running run method...");
	}
}

class AbsImpl extends Abs
{

	@Override
	public void display() {
		System.out.println("Display of abstract class...");
	}
	
}

public class O012_AbstractDemo {
	public static void main(String[] args) {
		
		//Abs abs = new Abs();
		
		AbsImpl impl = new AbsImpl();
		impl.display();
		impl.run();
	}
}
