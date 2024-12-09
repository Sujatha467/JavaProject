public class CurrentAccount extends BankAccount {
    double overdraftLimit;

    public CurrentAccount(int accountNumber, String accountHolderName, double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance + overdraftLimit) {
            System.out.println("Withdrawal failed! Overdraft limit exceeded.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful! Remaining Balance: " + balance);
        }
    }
}
