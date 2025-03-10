package array;

import java.util.Iterator;

public class A003_ArrayOperations {
	public static void main(String[] args) {
		
//		int a[] = {10,20,30,40,50,60,70,80};
//		int k[] = {500,600,700};
//		int b[] = new int[a.length+k.length];
		
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
		
		
//		for (int i = 0; i < a.length; i++) {
//			b[i] = a[i];
//		}
//		
//		for (int i = 0; i < k.length; i++) {
//			b[a.length+i] = k[i];
//		}
//		
//		for (int i = 0; i < b.length; i++) {
//			System.out.println(b[i]);
//		}
		
		
		
		//int a[] = {10,2,5,6,45,41,52,671,9,89,18};
			 
		//sum
//		int sum = 0;
//		for (int i = 0; i < a.length; i++) {
//			sum+=a[i];
//		}
//		System.out.println("sum : "+sum);
//		System.out.println("Avg : "+(sum/a.length));
//		
//
//		//max
//		int max = a[0];
//		int min = a[0];
//		for (int i = 0; i < a.length; i++) {
//			if(a[i]>max)
//			{
//				max = a[i];
//			}
//			
//			if(a[i]<min)
//			{
//				min = a[i];
//			}
//			
//		}
//		System.out.println("max : "+max);
//		System.out.println("min : "+min);
		
		int a[] = {10,2,5,6,45,671,41,52,671,9,89,18};
			 
		int a_max = a[0]; //10 45 671 
		int s_max = a[0]; //10 10 52 
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>a_max)
			{
				s_max = a_max;
				a_max = a[i];
			}
			else if(a[i]>s_max && a_max!=a[i])
			{
				s_max=a[i];
			}
		}
		
		System.out.println("s_max : "+s_max);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
