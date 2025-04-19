package practice;

import java.util.Scanner;

class Account
{
	double balance;
	public Account(double balance) {
		// TODO Auto-generated constructor stub
		this.balance = balance;
	}
	
	public void withdrow(double amount)
	{
		if(amount>=balance)
		{
			System.out.println("Insufficent amount");
		}
		else
		{
			balance-=amount;
			System.out.println("Current balance is : "+balance);
		}
	}
}

class Customer extends Thread
{
	Account ac;
	String name;
	public Customer(Account ac,String name) {
		// TODO Auto-generated constructor stub
		this.ac =  ac;
		this.name = name;
	}
	
	@Override
	public void run() {
		
		synchronized (ac) {
			
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount by : "+name);
		double amount = sc.nextDouble();
		ac.withdrow(amount);
		}
	}
}
public class Banking {
	public static void main(String[] args) {
		
		Account ac = new Account(1000);
		
		Customer c1 = new Customer(ac,"Ronak");
		Customer c2 = new Customer(ac,"Sitesh");
		c1.start();
		c2.start();
		
	}
}
