package ThisKeywordAndConstructor.Example3;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account> accounts = new ArrayList<>();

    // Method to add an account to the bank
    public void addAccount(Account account){
        accounts.add(account);
    }

    // Method to display all accounts and their balances
// Method to display all accounts and their balances
    public void showAccounts() {
        for (Account account : accounts) {
            account.displayBalance(); // Call displayBalance method from Account
        }
    }
}
