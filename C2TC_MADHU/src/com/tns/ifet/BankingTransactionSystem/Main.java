package com.tns.ifet.BankingTransactionSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account type (1 for Saving, 2 for Checking): ");
        int accountType = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        // Create account based on user input
        Account account;
        if (accountType == 1) {
            account = new SavingAccount();
        } else {
            account = new SavingAccount();
        }
        account.deposit(initialBalance);

        // Perform transactions
        Transaction transaction = new Transaction();
        while (true) {
            System.out.println("1. Deposit");
System.out.println("2. Withdraw");
System.out.println("3. Check Balance");
System.out.println("4. Exit");
System.out.print("Choose an option: ");
int option = scanner.nextInt();

switch (option) {
    case 1:
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        transaction.depositTransaction(account, depositAmount);
        break;
    case 2:
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        transaction.performTransaction(account, withdrawAmount);
        break;
    case 3:
        System.out.println("Current balance: $" + account.checkBalance());
        break;
    case 4:
        System.out.println("Exiting...");
        return;
    default:
        System.out.println("Invalid option. Please try again.");
}
}
}
}
