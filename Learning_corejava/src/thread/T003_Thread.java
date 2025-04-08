package thread;

class Calc extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			String name =  currentThread().getName();
			System.out.println(name+" : "+i);
		}
	}
}
public class T003_Thread {

	
	public static void main(String[] args) {
		
		
		Calc c1 = new Calc();
		Calc c2 = new Calc();
		Calc c3 = new Calc();
		
		c1.setName("A");
		c2.setName("B");
		c3.setName("C");
		
		
		
		c2.start();
	
		c1.start();
		c3.start();
		
	}
}
