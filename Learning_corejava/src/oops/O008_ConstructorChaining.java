package oops;

class P
{
	P()
	{
		System.out.println("P const..calling..");
	}
}
 
class Q extends P
{
	Q()
	{
		super();
		System.out.println("Q const..calling..");
	}
	
	Q(String name)
	{
		this();
		System.out.println("Name is : "+name);
	}
}

class R extends Q
{
	int k = 10;
	R()
	{
		super("Sitesh");
		System.out.println("R const..calling..");
	}
}



public class O008_ConstructorChaining {
	public static void main(String[] args) {
		
		//R r  = new R();
		
		//upcasting
		//P p = new Q();
		
		//down casting
		//Q q = (Q) new P();
		
		System.out.println(new P() instanceof Q);
		
		System.out.println(new Q() instanceof P);
	
	}
}
