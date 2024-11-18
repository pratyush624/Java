package ThisKeywordAndConstructor.Example3;

public class Account {
    private String accountNumber;
    private double balance;

    public Account(String accountNumber, double initialiseBalance){
        this.accountNumber = accountNumber;
        this.balance = initialiseBalance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        balance += amount; // Update balance
        System.out.println("Deposited: " + amount);
    }

    // Method to display the account balance
    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }

    // Getter method for account number (optional)
    public String getAccountNumber() {
        return accountNumber;
    }

    public void openAccount(Bank bank){
        bank.addAccount(this);
    }

}
