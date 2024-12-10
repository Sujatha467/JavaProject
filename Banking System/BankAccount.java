public class BankAccount {
        int accountNumber;
        String accountHolderName;
        double balance;

        public BankAccount(int accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposit successful! New Balance: " + balance);
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Insufficient funds! Withdrawal failed.");
            } else {
                balance -= amount;
                System.out.println("Withdrawal successful! Remaining Balance: " + balance);
            }
        }

        public void displayDetails() {
            System.out.println("Account Number: " + accountNumber +
                    ", Account Holder: " + accountHolderName +
                    ", Balance: " + balance);
            }
        }


