package logical;

public class P4 {
	public static void main(String[] args) {
		
//		    *****
//		     ****
//		      ***
//		       **
//	            *
		
		int lines = 5;
		int stars = lines;
		int spaces = 0;
		for(int j=1;j<=lines;j++)
		{
			for(int k=1;k<=spaces;k++)
			{
				System.out.print(" ");
			}
			for(int i=1;i<=stars;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars--;
			spaces++;
		}
	}
}
