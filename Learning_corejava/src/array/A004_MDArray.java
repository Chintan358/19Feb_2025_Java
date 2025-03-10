package array;

public class A004_MDArray {
	public static void main(String[] args) {
//		
//			int marks[][] = new int[5][3];
//		
//			marks[0][0] = 25;
//			marks[0][1] = 30;
//			marks[0][2] = 25;
//			
//			marks[1][0] = 25;
//			marks[1][1] = 30;
//			marks[1][2] = 25;
//			
//			for(int i=0;i<5;i++)
//			{
//				for(int j=0;j<3;j++)
//				{
//					System.out.print(marks[i][j]+" ");
//				}
//				System.out.println();
//			}
//					
		
			int a[][] = {{10,20,30},{40,50,60},{70,80,90}};
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
			
			System.out.println("+++++++++++++++++++++++++++++++++");
		
			int b[][] = {{1,2,3},{4,5,6},{7,8,9}};
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println();
			}
			 
			System.out.println("===========================");
			
		
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+b[i][j]+" ");
				}
				System.out.println();
			}
	}
}
