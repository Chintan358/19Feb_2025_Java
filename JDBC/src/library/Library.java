package library;

import java.util.Scanner;

public class Library {
	public static void main(String[] args) {
		
		int choice = 0;
		do {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter operation : ");
		System.out.println("1 : Add Book");
		System.out.println("2 : View Book");
		System.out.println("3 : Delete Book");
		System.out.println("4 : Issue Book");
		System.out.println("0 : Exit");
		
		choice  =sc.nextInt();
		
		LibraryOprations lo = new LibraryOprations();
		if(choice==1)
		{
			System.out.println("*********ADD BOOK**********");
			lo.addBook();
		}
		else if(choice==2)
		{
			lo.viewBook();
		}
		else if(choice==3) {
			lo.deleteBook();
		}
		else if(choice==4)
		{
			lo.issueBook();
		}
		else if(choice==0)
		{
			System.out.println("You are exit !!!");
		}
		else
		{
			System.out.println("Invalid choice");
		}
		
		
		
		}while(choice!=0);
		
		
		
	}
}
