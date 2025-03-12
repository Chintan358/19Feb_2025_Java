package oops;

class Demo
{
	static int count = 0;
	public Demo() {
		// TODO Auto-generated constructor stub
		count++;
	}
	
}
public class O003_StaticDemo {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		Demo d1 = new Demo();
		Demo 
		
		d2 = new Demo();
		
		System.out.println("total objects : "+Demo.count);
	}
}
