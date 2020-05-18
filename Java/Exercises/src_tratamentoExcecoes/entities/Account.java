package entities;

import DomainException.Exception_TE;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
		
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void Deposit(Double amount) {
		this.balance += amount;
	}
	
	public void withdraw(Double amount) {
		if(amount > this.balance) {
			throw new Exception_TE("Not enough balance");
		}
		
		if(amount > this.withdrawLimit) {
			throw new Exception_TE("The amount exceeds withdraw limit");
		}

		this.balance -= amount;
	}
	
	@Override
	public String toString() {
		return "New Balance: " + this.getBalance();
	}
}
