package thread;

import java.util.Scanner;

class Account
{
	double balance;

	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public boolean isAmountExist(double amt)
	{
		boolean b = false;
		if(balance>=amt)
		{
			b = true;
		}
		
		return b;
	}
	
	public void withdrow(double amt)
	{
		balance = balance-amt;
		System.out.println("Amount withdowd, current balance is : "+balance);
	}
	
}

class Customer implements Runnable
{
	String name;
	Account account;
	
	public Customer(String name, Account account) {
		super();
		this.name = name;
		this.account = account;
	}



	@Override
	public void run() {
		
		synchronized (account) {
			
		
		Scanner sc  =new Scanner(System.in);
		System.out.println("enter amount to withdrow By : "+name);
		double amt = sc.nextDouble();
		
		if(account.isAmountExist(amt))
		{
			account.withdrow(amt);
		}
		else
		{
			System.out.println("Insufficent amount");
		}
		
		}
	}
	
}

public class T004_Syncronization {
	public static void main(String[] args) {
		
		Account acccount = new Account(10000);
		
		Customer c1 = new Customer("Sitesh",acccount);
		Customer c2 = new Customer("Ronak",acccount);
		
		Thread th1 = new Thread(c1);
		Thread th2 = new Thread(c2);
		
		th1.start();
		th2.start();
		
		
	}
}
