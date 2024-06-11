package bankingSystem;

public class Bank {
	
	private Account[] accounts;
    private int numAccounts;
    public Bank() 
    {
        accounts = new Account[5]; // Assuming a maximum of 100 accounts
        numAccounts = 0;
    }
    public void addAccount(Account account) {
        accounts[numAccounts] = account;
        numAccounts++;
    }
    public void removeAccount(Account account) {
        for (int i = 0; i < numAccounts; i++) {
            if (accounts[i] == account) {
                // Shift remaining accounts to fill the gap
                for (int j = i; j < numAccounts - 1; j++) {
                    accounts[j] = accounts[j + 1];
                }
                numAccounts--;
                break;
            }
        }
    }
    public void displayAccounts() {
        for (int i = 0; i < numAccounts; i++) {
            System.out.println(accounts[i].getAccountInfo());
            System.out.println("");
        }
    }

}
