package logical;

public class P2 {
	public static void main(String[] args) {
		
//		*
//		**
//		***
//		****
//		*****
		
		int lines = 5;
		int stars = 1;
		for(int j=1;j<=lines;j++)
		{
			for(int i=1;i<=stars;i++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars++;
		}
	}
}
