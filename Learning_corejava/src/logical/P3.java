package logical;

public class P3 {
	public static void main(String[] args) {
		
//		*****
//		****
//		***
//		**
//		*
		
		int lines = 5;
		int stars = lines;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=stars;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars--;
		}
	}
}
