package com;

import java.util.Arrays;
import java.util.List;

public class StreamAPI {
	public static void main(String[] args) {
		
		List<Integer> l = Arrays.asList(10,2,30,46,50,4 ,56 ,1,12);
		
//		int k = l.stream().reduce(0, (a,b)-> a+b);
		
		int k = l.stream().reduce(10, (a,b)-> a<b?a:b);

		
		System.out.println(k);
		
		
	}
}
