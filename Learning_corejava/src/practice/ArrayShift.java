package practice;

import java.util.Arrays;

public class ArrayShift {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80};
		
//		for(int i=1;i<a.length;i++)
//		{
//			a[i] = a[i-1];
//		}
		
		int temp = a[a.length-1];
		for(int i=a.length-1;i>=1;i--)
		{	
			a[i] = a[i-1];		
		}
		a[0] = temp;
		System.out.println(Arrays.toString(a));
	}
}
