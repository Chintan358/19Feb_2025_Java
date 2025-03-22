package impclasses;

public class Swap {
	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
//		int temp =a;
//		a = b;
//		b = temp;
		
		a = a+b; //30
		b = a-b;
		a = a-b;
		
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		
	}
}
