package logical;

public class L001_OddEven {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			int number = i;
			
			if(number%2==0)
			{
				System.out.println(number+" is Even");
			}
			else
			{
				System.out.println(number+" is Odd");
			}
		
		}
	}
}
