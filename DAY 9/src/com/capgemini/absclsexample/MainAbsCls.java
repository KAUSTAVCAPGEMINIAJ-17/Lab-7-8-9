package com.capgemini.absclsexample;

import java.util.Scanner;

public class MainAbsCls {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		char ch = 'y';
		SavingsAccount sa = new SavingsAccount();
		while (ch == 'y') {
			System.out.println("Enter the choice:\n");
			System.out.println("addMoney");
			System.out.println("withdrawMoney");
			System.out.println("checkBalnce");
			String option = sc.next();

			switch (option) {
			case "addMoney":
				sa.creditAmount();
				break;

			case "withdrawMoney":
				sa.withdraw();
				break;

			case "checkBalnce":
				sa.checkBalance();
				break;

			default:
				System.out.println("Not valid option");

			}// Switch close
			System.out.println("Do you want to continue? (y/n)");
			ch = sc.next().trim().charAt(0);
		} // while close
		sc.close();
	}// main close

}// class close