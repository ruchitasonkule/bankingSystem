package bankingSystem;

class CheckingAccount extends Account
{
	double overdraftLimits;
	
	public CheckingAccount(int accountNumber, String accountHolderName, double balance, String accountType, double overdraftLimits) 
	{
		super(accountNumber, accountHolderName, balance, accountType);
		this.overdraftLimits=overdraftLimits;
	}

	@Override
	void deposite(double amount) 
	{
		setBalance(getBalance()+amount);
	}


	@Override
	void withdraw(double amount) 
	{
		if(getBalance()+overdraftLimits >= amount)
		{
			setBalance(getBalance()-amount);
		}
		else
		{
			System.out.println("Withdrawal cannot be processed due to insufficient funds.");
		}
	}

	
	
	
	public void checkOverdraft()
	
	{
		if(getBalance()<0)
		{
			System.out.println("Account is overdrawn");
		}
		else
		{
			System.out.println("Account is not overdrawn");
		}
	}

	
}




