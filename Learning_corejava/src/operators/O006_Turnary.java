package operators;

public class O006_Turnary {
	public static void main(String[] args) {
		
//		condition ? true : false
//		
		
		int a = 100;
		int b = 200;
		int c = 520;
		
//		String r =  a>b ? "A is greater" : "B is greater";
		
		String r  =a>b? 
					a>c? "A is greater":"C is greater" : 
					b>c?"B is greater":"C is greater";
		
		
		System.out.println(r);
	}
}
