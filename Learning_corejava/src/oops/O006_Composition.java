package oops;

class Sample
{
	public void display()
	{
		System.out.println("runing display..");
	}
}
class Run
{
	static Sample sample = new Sample();
}

public class O006_Composition {
	public static void main(String[] args) {
		
		//Run run =new Run();
		
		Run.sample.display();
		System.out.println();
	}
}
