package thread;


class Demo
{
	
}
class Th1 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("th1 : "+i);
		}
	}
}

class Th2 extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("th2 : "+i);
		}
	}
}

public class T001_ThreadDemo {
	public static void main(String[] args) {
		
		Th1 t1 = new Th1();
		Th2 t2 = new Th2();
		
//		t1.run();
//		t2.run();
//		

		t1.setName("A");
		t2.setName("B");
	
		
		t2.setPriority(Thread.MAX_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
//		System.out.println(t1.getName()+" "+t2.getName());
//		System.out.println(t1.getId()+" "+t2.getId());
//		System.out.println(t1.getPriority()+" "+t2.getPriority());
//		
	
		t1.start();
		t2.start();
	}
}
