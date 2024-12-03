import java.util.ArrayList;
import java.util.List;

public class BankManager {
    List<BankAccount> accounts = new ArrayList<>();

    // Create a new account
    public void createAccount(BankAccount account) {
        accounts.add(account);
        System.out.println("Account created successfully for " + account.accountHolderName);
    }

    // Find an account by account number
    public BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        System.out.println("Account with number " + accountNumber + " not found.");
        return null;
    }

    // Handle deposit for a specific account
    public void handleDeposit(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    // Handle withdrawal for a specific account
    public void handleWithdrawal(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    // Display details of all accounts
    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            System.out.println("All Bank Accounts:");
            for (BankAccount account : accounts) {
                account.displayDetails();
            }
        }
    }
}






