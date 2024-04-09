class CheckingAccount extends BankAccount
{
	int fee=15;
	public CheckingAccount(String name, double amount)
	{ 
		super(name,amount);
	}
	
public boolean withdraw(double amount)
	{ 
		double totalAmount = amount+fee;
		return super.withdraw(totalAmount);
	}
}