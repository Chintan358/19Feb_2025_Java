package impclasses;

class StringDemo {
	public static void main(String[] args) {
		
		//string literal
//		String s = "Hello";
		
		//String object
//		String str = new String("Hello");
		
//		System.out.println(s);
//		System.out.println(str);
		
//		String s1 =  s.concat("Java");
//		System.out.println(s1);

		
		String s1 = "Java";
		String s2 = "Mava";
		String s3 = "Java";
		
		
		String str1 = new String("Java");
		String str2 = new String("Mava");
		String str3 = new String("Java");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);

		System.out.println("**********");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
	}
}
