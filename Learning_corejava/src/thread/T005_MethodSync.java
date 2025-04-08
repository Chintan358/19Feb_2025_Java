package thread;

class Maths
{
	synchronized public void table(int a)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" : "+(a*i));
		}
	}
}
class Calc1 extends Thread
{
	Maths m = new Maths();

	public void run() {
				
		m.table(11);
	}
}
public class T005_MethodSync {
	public static void main(String[] args) {
		
		Calc1 c1 = new Calc1();
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c1);
		Thread t3 = new Thread(c1);
		
		t1.start();
		t2.start();
		t3.start();
		
		
	}
}
