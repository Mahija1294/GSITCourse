package myfirstpackage;

abstract class BankAccount
{
	String accountHolder;
	double balance;
	
	BankAccount(String accountHolder, double balance)
	{
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
	
	void showBalance()
	{
		System.out.println(accountHolder + " has " + balance + " balance");
	}
	
	abstract void calculateInterest();
}

class SavingAccount extends BankAccount
{
	SavingAccount(String accountHolder, double balance )
	{
		super(accountHolder, balance);
	}

	
	@Override
	void calculateInterest()
	{
		double interest = balance*0.04;
		System.out.println("Saving account interest is: " + interest);
	}	
}

class CurrentAccount extends BankAccount
{
	CurrentAccount(String accountHolder, double balance)
	{
		super(accountHolder,balance);
	}

	@Override
	void calculateInterest() {
		System.out.println("No interest calculated for current account");
	}	
}


public class UnderstandingAbstractionTwo {

	public static void main(String[] args) {
		SavingAccount SV = new SavingAccount("Shivam", 2000);
		SV.calculateInterest();
		SV.showBalance();
		
		CurrentAccount current = new CurrentAccount("Anuja", 3000);
		current.calculateInterest();
		current.showBalance();

	}

}
