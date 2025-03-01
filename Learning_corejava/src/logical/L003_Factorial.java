package logical;

public class L003_Factorial {
	public static void main(String[] args) {
		
		
		int number = 10;
		int fact = 1;
//		for(int i=number;i>=1;i--)
//		{
//			fact*=i;
//		}
		
		while(number !=0)
		{
			fact*=number;
			number--;
		}
		
		
		System.out.println(fact);
		
	}
}
