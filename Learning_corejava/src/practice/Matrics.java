package practice;

public class Matrics {
	public static void main(String[] args) {
		
		
		int a[][] = {{10,20,30},{22,22,30},{22,50,70}};
		int b[][] = {{65,45,66},{10,24,45},{10,20,50}};
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j]+" ");
			}System.out.println();
		}
		System.out.println("*******************");
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]+" ");
			}System.out.println();
		}
		
		int c[][] = new int[3][3];
		
		System.out.println("*****************************");
		
		for (int i = 0; i < 3; i++) {
			for (int j=0; j<3; j++) {
				
			c[i][j] = 0;
			for(int k=0;k<3;k++)
			{
				c[i][j]+=a[i][k]*b[k][j];
			}	
			System.out.print(c[i][j]+" ");
		}
			System.out.println();
		}
		
		//i = 0
		//j = 0 1
		
		
		
	}
}
