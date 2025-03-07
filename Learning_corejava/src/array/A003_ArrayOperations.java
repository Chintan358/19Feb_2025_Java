package array;

import java.util.Iterator;

public class A003_ArrayOperations {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50,60,70,80};
		int k[] = {500,600,700};
		int b[] = new int[a.length+k.length];
		
//		System.arraycopy(a, 2, b, 0, 4);
		
//		for(int i=0;i<a.length;i++)
//		{
//			b[i] = a[i];
//		}
		
//		for(int i=0;i<a.length;i++)
//		{
//			if(i%2!=0)
//			{
//				b[i] = a[i];
//			}
//		}
		
		
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		
		for (int i = 0; i < k.length; i++) {
			b[a.length+i] = k[i];
		}
		
		
		
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		
		
		
		
		
	}
}
