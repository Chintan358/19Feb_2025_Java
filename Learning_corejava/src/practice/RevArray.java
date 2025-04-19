package practice;

import java.util.Arrays;

public class RevArray {
	
	public static int[] rarray(int a[])
	{
		int b[] =  new int[a.length];
		
		int count = 0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[count] = a[i];
			count++;
		}
		return b;
	}
	
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] =  rarray(a);
		System.out.println(Arrays.toString(b));
		
	}
}
