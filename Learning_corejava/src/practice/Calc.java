package practice;

import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		String ch=null;
		
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number 1 : ");
		double a = sc.nextInt();
		System.out.println("Enter number 2 : ");
		double b = sc.nextInt();
		System.out.println("enter chouice : ");
		System.out.println("1 : Add, 2 : Sub, 3 : Mul, 4 : Div");
		int choice = sc.nextInt();
		
		
		if(choice==1)
		{
			System.out.println("Addition is : "+(a+b));
		}
		else if(choice==2)
		{
			System.out.println("substraction is : "+(a-b));
		}
		else if(choice==3)
		{
			System.out.println("Multiplication is : "+(a*b));
		}
		else if(choice==4)
		{
			System.out.println("division is : "+(a/b));
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		
		System.out.println("Do u want to continue ? y or n");
		ch = sc.next();
		}while(!ch.equals("n"));
	}
}
