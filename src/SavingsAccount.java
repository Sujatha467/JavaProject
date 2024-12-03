public class SavingsAccount extends BankAccount {
    double interestRate;
    int withdrawalLimit = 5; // Maximum withdrawals allowed per month
    int withdrawalsMade = 0; // Counter for withdrawals made

    public SavingsAccount(int accountNumber, String accountHolderName, double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        System.out.println("Interest Earned: " + interest);
    }

    @Override
    public void withdraw(double amount) {
        try {
            if (withdrawalsMade >= withdrawalLimit) {
                System.out.println("Withdrawal failed! Maximum withdrawal limit reached.");
            } else if (amount > balance) {
                throw new InsufficientFundsException("Insufficient funds for withdrawal.");
            } else {
                balance -= amount;
                withdrawalsMade++;
                System.out.println("Withdrawal successful! Remaining Balance: " + balance);
                System.out.println("Withdrawals remaining this month: " + (withdrawalLimit - withdrawalsMade));
            }
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage()); // Display the exception message
        }
    }

    public void resetWithdrawals() {
        withdrawalsMade = 0;
        System.out.println("Withdrawal count reset for the new month.");
    }
}
