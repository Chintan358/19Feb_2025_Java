package basic;

public class Datatypes {
	public static void main(String[] args) {

//		byte b = -128;
//		short s = 32767;
//		int i = 328000;
//		long l = 45645454545l;
//
//		float f = 32.565656566546f;
//		double d = 45454.565655546565654;
//
//		char ch = 'A';
//		boolean bool = true;

//		System.out.println(f);
//		System.out.println(d);

//		char c = 42;
//		System.out.println(c);
//		
//		int i = '*';
//		System.out.println(i);
//		
		//widning - implicite
		int i = 123;
		long l = i;
		
		//nerrowing - explicite
		long k = 1554454545454l;
		int j = (int) k;
		System.out.println(j);
		
	}
}
