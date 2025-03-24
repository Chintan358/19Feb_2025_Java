package exception;

class Test
{
	public void disp() throws ClassNotFoundException
	{
//		try {
//			Class.forName("logical.P1");
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Class.forName("logical.P1");
		
	}
}

public class CompiletimeDemo {
	public static void main(String[] args) {
			
		Test t = new Test();
		try {
			t.disp();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}					
	}
}
