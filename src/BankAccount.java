public class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    // Constructor to initialize account details
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful! New Balance: " + balance);
    }

    // Withdraw money from the account
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds! Withdrawal failed.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        }
    }

    // Display account details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Account Holder: " + accountHolderName + ", Balance: " + balance);
    }
}







