package com.tns.ifet.BankingTransactionSystem;

public class Transaction {
final static double transactionFee=0.5;
public final void performTransaction(Account account,double amount) {
	  if (amount > 0) {
          if (account.checkBalance() >= amount) {
              account.withdraw(amount);
              System.out.println("Transaction successful!");
              System.out.println("Transaction fee: $" + transactionFee);
              System.out.println("Remaining balance: $" + account.checkBalance());
          } else {
              System.out.println("Insufficient funds!");
          }
      } else {
          System.out.println("Invalid transaction amount!");
      
}
}
public class Main{
	@SuppressWarnings("null")
	public static void main(String[] args) {
		int amount = 0;
		if (amount > 0) {
            Account account = null;
			account.deposit(amount);
            System.out.println("Deposit successful!");
            System.out.println("Transaction fee: $" + transactionFee);
            System.out.println("New balance: $" + account.checkBalance());
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }

    public final void transferTransaction(Account fromAccount, Account toAccount, double amount) {
        if (amount > 0) {
            if (fromAccount.checkBalance() >= amount) {
                fromAccount.withdraw(amount);
                toAccount.deposit(amount);
                System.out.println("Transfer successful!");
                System.out.println("Transaction fee: $" + transactionFee);
                System.out.println("From account balance: $" + fromAccount.checkBalance());
                System.out.println("To account balance: $" + toAccount.checkBalance());
            } else {
                System.out.println("Insufficient funds!");
            }
        } else {
            System.out.println("Invalid transfer amount!");
        }
    }}
public void depositTransaction(Account account, double depositAmount) {
	// TODO Auto-generated method stub
	
}}
