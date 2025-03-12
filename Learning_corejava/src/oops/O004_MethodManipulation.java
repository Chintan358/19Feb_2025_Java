package oops;

class Calc
{
	public void msg()
	{
		System.out.println("runing msg method...");
	}
	
	public void square(int a)
	{
		System.out.println(a*a);
	}
	
	public int add(int a, int b)
	{
		//System.out.println(a+b);	
		int c = a+b;
		return c;
	}
	
	public String getMsg()
	{
		return "Hello, sitesh";
	}
	
	public void addArray(int a[])
	{
		int sum =0;
		for (int i = 0; i < a.length; i++) {
			sum +=a[i];
		}
		System.out.println(sum);
	}
	
	public int[] revArray(int a[])
	{
		int b[] = new int[a.length];
		int count = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[count] = a[i];
			count++;
		}
		
		return b;
	}
	
	public void varargs(int...a)
	{
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
}

public class O004_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
//		c.msg();
//		c.square(15);
//		int k =  c.add(10, 20);
//		//System.out.println(k);
//		System.out.println(c.add(10, 30));
//		c.square(k);
//		String s =  c.getMsg();
//		System.out.println(s);
		
		
		int a[] = {10,20,30,40,50};
		c.addArray(a);
		
		int k[] =  c.revArray(a);
		for (int i = 0; i < k.length; i++) {
			System.out.println(k[i]);
		}
		
		c.varargs(10,20,30,40,50,40,50,60);
	}
}
