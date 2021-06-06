package com.capgemini.Employee.idSalary.exception;

import java.util.Scanner;

public class EmployeeException {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary=sc.nextDouble();
		try {
			if(salary<0)
				throw new SalaryNotValid("Invalid salary AS Salary is not Accountable in Negative..");
		}catch(SalaryNotValid an) {
			System.out.println(an.getMessage());
		}sc.close();
}
}