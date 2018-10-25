package model.entities;

import model.exceptions.DomainException;

public class Account {

	private int number;
	private String name;
	private double balance;
	private double withDrawLimit;

	public Account(int number, String name, double balance, double withDrawLimit) {
		this.number = number;
		this.name = name;
		this.balance = balance;
		this.withDrawLimit = withDrawLimit;

	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public double getWithDrawLimit() {
		return withDrawLimit;
	}

	public void setWithDrawLimit(double withDrawLimit) {
		this.withDrawLimit = withDrawLimit;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withDraw(double amount) {
	
		if (amount > withDrawLimit) {
			throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
		}
		else if (amount>balance) {
			throw new DomainException("Withdraw error: Not enough balance");
		}
		else {
			balance -= amount;
		}

	}

}
