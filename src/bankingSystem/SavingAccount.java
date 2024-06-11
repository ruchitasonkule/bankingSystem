package bankingSystem;

public class SavingAccount extends Account {
	private double interestRate;
	public SavingAccount(int accountNumber, String accountHolderName, double balance, String accountType ,double interestRate) {
		super(accountNumber, accountHolderName, balance, accountType);
		this.interestRate=interestRate;
	}

	@Override
	void deposite(double amount)
	{
		setBalance(getBalance()+amount);
		
	}

	@Override
	void withdraw(double amount) 
	{
		if(getBalance()>=amount) 
		{
			setBalance(getBalance()-amount);
			System.out.println("sufficient");
		}
		else
		{
			System.out.println("Withdrawal cannot be processed due to insufficient funds");
		}
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double calculateInterest()
	{
		return getBalance()*interestRate;
	}

}
