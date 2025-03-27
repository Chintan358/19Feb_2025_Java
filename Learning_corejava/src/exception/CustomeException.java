package exception;

class InsuffcientAmountException extends RuntimeException
{
	double need;
	public InsuffcientAmountException(double need) {
		this.need = need;
	}
	
	@Override
	public String getMessage() {
		
		return "you need more : "+need+" amount in your account";
	}
}

class Bank
{
	double balance;
	
	public void getBalance()
	{
		System.out.println("Your current balance is : "+balance);
	}
	
	public void deposite(double amt)
	{
		balance+=amt;
	}
	
	public void withdrow(double amt) throws InsuffcientAmountException
	{
		if(amt>balance)
		{
			double need = amt-balance;
			 		
			balance-=amt;
		}
	}
}

public class CustomeException {
	public static void main(String[] args) {
		
		Bank b = new Bank();
		b.getBalance();
		b.deposite(5000);
		b.deposite(3000);
		b.getBalance();
		try {
			b.withdrow(10000);
		} catch (InsuffcientAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		b.getBalance();
	}
}
