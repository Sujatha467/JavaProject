import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BankManager manager = new BankManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Banking System ---");
            System.out.println("1. Create Savings Account");
            System.out.println("2. Create Current Account");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. View All Accounts");
            System.out.println("6. Reset Withdrawals (Savings Accounts Only)");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number: ");
                    int savingsAccNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Account Holder Name: ");
                    String savingsHolderName = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double savingsBalance = scanner.nextDouble();
                    System.out.print("Enter Interest Rate: ");
                    double interestRate = scanner.nextDouble();
                    manager.createSavingsAccount(savingsAccNo, savingsHolderName, savingsBalance, interestRate);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    int currentAccNo = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter Account Holder Name: ");
                    String currentHolderName = scanner.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    double currentBalance = scanner.nextDouble();
                    System.out.print("Enter Overdraft Limit: ");
                    double overdraftLimit = scanner.nextDouble();
                    manager.createCurrentAccount(currentAccNo, currentHolderName, currentBalance, overdraftLimit);
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    int depositAccNo = scanner.nextInt();
                    System.out.print("Enter Amount to Deposit: ");
                    double depositAmount = scanner.nextDouble();
                    manager.handleDeposit(depositAccNo, depositAmount);
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    int withdrawAccNo = scanner.nextInt();
                    System.out.print("Enter Amount to Withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    manager.handleWithdrawal(withdrawAccNo, withdrawAmount);
                    break;

                case 5:
                    manager.displayAllAccounts();
                    break;

                case 6:
                    System.out.print("Enter Account Number: ");
                    int resetAccNo = scanner.nextInt();
                    manager.resetSavingsAccountWithdrawals(resetAccNo);
                    break;

                case 7:
                    System.out.println("Exiting. Goodbye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
