


package practice;

class D extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
//			try {
//				//sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println(currentThread().getName()+" : thread calling...");
		}
	}
}
public class ThreadDemo {
	public static void main(String[] args) {
		
		
		D d1 = new D();
		D d2 = new D();
		D d3 = new D();
		D d4 = new D();
		
	
		d1.start();
		d2.start();
		d3.start();
		d4.start();
		
		
		
		
	}
}
