import java.util.Scanner;

public class Main {
    public static void main(String[] args){
            BankManager manager = new BankManager();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\n--- Bank Management System ---");
                System.out.println("1. Create Account");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. View All Accounts");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                int choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        System.out.print("Enter Account Number: ");
                        int accountNumber = scanner.nextInt();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter Account Holder Name: ");
                        String accountHolderName = scanner.nextLine();
                        System.out.print("Enter Initial Balance: ");
                        double balance = scanner.nextDouble();
                        manager.createAccount(new BankAccount(accountNumber, accountHolderName, balance));
                        break;

                    case 2:
                        System.out.print("Enter Account Number: ");
                        int depositAccount = scanner.nextInt();
                        System.out.print("Enter Amount to Deposit: ");
                        double depositAmount = scanner.nextDouble();
                        manager.handleDeposit(depositAccount, depositAmount);
                        break;

                    case 3:
                        System.out.print("Enter Account Number: ");
                        int withdrawAccount = scanner.nextInt();
                        System.out.print("Enter Amount to Withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        manager.handleWithdrawal(withdrawAccount, withdrawAmount);
                        break;

                    case 4:
                        manager.displayAllAccounts();
                        break;

                    case 5:
                        System.out.println("Exiting Bank Management System. Goodbye!");
                        scanner.close();
                        return;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }






