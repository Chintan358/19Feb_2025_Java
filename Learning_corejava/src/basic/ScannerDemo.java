package basic;

import java.util.Scanner;

public class ScannerDemo {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a : ");
		int a = sc.nextInt();
		System.out.println("enter b : ");
		int b = sc.nextInt();
		System.out.println("enter name : ");
		String name = sc.next();
		System.out.println("enter address : ");
		sc.nextLine();
		String address = sc.nextLine();
		
		System.out.println(a+b);
		System.out.println(name);
		System.out.println(address);
		
	}
}
