package exception;

class Demo
{
	public void square(int a)
	{
		System.out.println(a*a);
		a++;
		if(a<20)
		{
			square(a);
		}
		
	}
}
public class RecursionDemo {
	public static void main(String[] args) {
		
		
		Demo d = new Demo();
		d.square(10);
		
		
	}
}
