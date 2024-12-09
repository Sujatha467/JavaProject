import java.util.ArrayList;
import java.util.List;

public class BankManager {
    List<BankAccount> accounts = new ArrayList<>();

    public void createSavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        accounts.add(new SavingsAccount(accountNumber, accountHolderName, balance, interestRate));
        System.out.println("Savings Account created for " + accountHolderName);
    }

    public void createCurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        accounts.add(new CurrentAccount(accountNumber, accountHolderName, balance, overdraftLimit));
        System.out.println("Current Account created for " + accountHolderName);
    }

    public BankAccount findAccount(int accountNumber) {
        for (BankAccount account : accounts) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        System.out.println("Account not found!");
        return null;
    }

    public void handleDeposit(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
        }
    }

    public void handleWithdrawal(int accountNumber, double amount) {
        BankAccount account = findAccount(accountNumber);
        if (account != null) {
            account.withdraw(amount);
        }
    }

    public void resetSavingsAccountWithdrawals(int accountNumber) {
        BankAccount account = findAccount(accountNumber);
        if (account instanceof SavingsAccount) {
            ((SavingsAccount) account).resetWithdrawals();
        } else {
            System.out.println("Reset feature is only available for Savings Accounts.");
        }
    }

    public void displayAllAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (BankAccount account : accounts) {
                account.displayDetails();
            }
        }
    }
}
