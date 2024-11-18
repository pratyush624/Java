package ThisKeywordAndConstructor.Example3;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Account account1 = new Account("12345", 6000.0);
        Account account2 = new Account("56789", 5000);

        // Open accounts in the bank
        account1.openAccount(bank);
        account2.openAccount(bank);

        // show all accounts and their balances
        bank.showAccounts();



    }
}
