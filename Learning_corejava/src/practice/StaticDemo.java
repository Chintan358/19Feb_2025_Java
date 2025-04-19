package practice;


class Std
{
	final static int id=10;
	String name="Ronak";
	
	public void disp()
	{
		System.out.println(id+" "+name);
	}
}
public class StaticDemo {
	public static void main(String[] args) {
		
		Std st  =new Std();
		//st.id=20;
		st.disp();
		
		
		Std st1  =new Std();
		st1.disp();
		
		Std st2  =new Std();
		st2.disp();
		
		
		
	}
}
