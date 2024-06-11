package bankingSystem;

public class Main {

	public static void main(String[] args) {

		 Bank bank = new Bank();
	        SavingAccount savingsAccount = new SavingAccount(123456, "Ruchita",100,"Saving",0.05);
	    
	        bank.addAccount(savingsAccount);
	        savingsAccount.deposite(500);
	        savingsAccount.withdraw(100);
	        
	        
	       double interestEarned = savingsAccount.calculateInterest();
	        System.out.println("Interest earned on savings account: " + interestEarned);
	        CheckingAccount checkingAccount = new CheckingAccount(654321, "Trupti", 500, "Checking", 1000);
	        bank.addAccount(checkingAccount);
	        checkingAccount.deposite(800);
	        checkingAccount.withdraw(300);
	        checkingAccount.checkOverdraft();
	        bank.displayAccounts(); 
	    	
	    	
	    }
	}


