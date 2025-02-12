package com.tns.ifet.BankingTransactionSystem;
 abstract class Account {
protected double balance;
public abstract void deposit(double amount);
public abstract void withdraw(double amount);
public abstract double checkBalance();
}
class SavingAccount extends Account{

	@Override
	public void deposit(double amount) {
		// TODO Auto-generated method stub
		balance+=amount;
	}
	@Override
	public void withdraw(double amount) {
		// TODO Auto-generated method stub
		balance-=amount;
	}
	@Override
	public double checkBalance() {
		return balance;
	}
}
