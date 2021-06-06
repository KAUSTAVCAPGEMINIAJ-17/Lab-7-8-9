package com.capgemini.absclsexample;

import java.util.Scanner;

public abstract class BankAccount {
	int accId;
	String accHolderName;
	float minBal;
	float actualBal;
	String address;
	String accType;
	Scanner details = new Scanner(System.in);

	public BankAccount() {
		super();
	}

	public BankAccount(int acccId, String accHolderName, float minBal, float actualBal, String adddress, String accType,
			Scanner details) {
		super();
		this.accId = acccId;
		this.accHolderName = accHolderName;
		this.minBal = minBal;
		this.actualBal = actualBal;
		this.address = adddress;
		this.accType = accType;
		this.details = details;
	}

	public void enterDetailsToOpenAccount() {
		System.out.println("Enter the details to open an account");

	}

	// abstract method
	public abstract void openAccount();// method signature

	public abstract float calculateInterest();

	public abstract void creditInterest();

	public abstract void creditAmount();

	public abstract void checkBalance();

	public abstract void withdraw();

	public void withDraw() {
		// TODO Auto-generated method stub
		
	}

}