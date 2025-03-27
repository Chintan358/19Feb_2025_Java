package exception;



public class ExceptionDemo {
	public static void main(String[] args) {
		
		
		System.out.println("Program started");
		
		try
		{
			int a = 20;
			int b  =a/0;
			System.out.println(b);
			
//			int a[] = new int[5];
//			a[7] = 40;
			
		} 
		catch (ArrayIndexOutOfBoundsException e) {
			
			e.printStackTrace();
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
		}
		finally {
			//always executable
		}
		
		System.out.println("Program ended");
	}
}
