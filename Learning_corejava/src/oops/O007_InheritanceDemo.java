package oops;

//parent - base - super
class A
{
	int a = 10;
	public void display()
	{
		System.out.println("running display...");
	}
}

//child - derived - sub
class B extends A
{
	int a = 50;
	public void test()
	{
		int a = 90;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println("running test...");
	}
}

class C extends A
{
	
}

public class O007_InheritanceDemo {
	public static void main(String[] args) {
		
		B b  =new B();
		//b.display();
		b.test();	
	}
}


