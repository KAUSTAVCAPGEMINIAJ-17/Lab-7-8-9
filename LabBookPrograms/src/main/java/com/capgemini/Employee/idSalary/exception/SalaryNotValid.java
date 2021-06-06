package com.capgemini.Employee.idSalary.exception;

@SuppressWarnings("serial")
public class SalaryNotValid extends Exception {
	String message;
	SalaryNotValid(String msg){
		super(msg);
		message=msg;
}
}