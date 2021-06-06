package com.capgemini.Employee.idSalary.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.capgemini.Employee.idSalary.bean.Employee;

public class EmployeeMain extends Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner ip=new Scanner(System.in);
		HashMap<String,Employee> hmap=new HashMap<String,Employee>();
		HashMap<String,Integer> alist=new HashMap<String,Integer>();
		int c;
		char ch='y';
		while(ch=='y') {
			System.out.println("1.Add Employee Details");
			System.out.println("2. Display Employee Details according to Insurance Scheme");
		    System.out.println("3. Delete Employee Details");
			System.out.println("Enter your choice- ");
			c=ip.nextInt();
			switch(c) {
			case 1 : System.out.print("Enter the  total number of employees : ");
					int numOfEmp=ip.nextInt();
					Employee emp[]=new Employee[numOfEmp];
					for(int i=0;i<numOfEmp;i++) {
						emp[i]=new Employee();
					}
					for(int i=0;i<numOfEmp;i++) {
						System.out.println("Enter the Employee id: ");
						emp[i].id=ip.nextInt();
						System.out.println("Enter the Name: ");
						emp[i].name=ip.next();
						System.out.println("Enter the salary: ");
						emp[i].salary=ip.nextDouble();
						System.out.println("Enter the Designation in the Office : ");
						ip.nextLine();
						emp[i].designation=ip.nextLine();
						hmap.put(emp[i].getInsuranceScheme(), emp[i]);
						alist.put(emp[i].getInsuranceScheme(),emp[i].id);
						System.out.println();
					}
					System.out.println("Hash Map after adding employee details :\n");
					for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
						System.out.println(m.getValue());
					}
					break;
			case 2 : System.out.print("Enter the insurance scheme: ");
					ip.nextLine();
					String ins_scheme=ip.nextLine();
					System.out.print("The employee details for the given insurance scheme are :\n ");
					for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
						if(m.getKey().equalsIgnoreCase(ins_scheme))
						System.out.println(m.getValue());
					}
					break;
			case 3 :
					System.out.print("Enter the id of the employee you want to delete: ");
					int id=ip.nextInt();
					for(Map.Entry<String,Integer> m : alist.entrySet()) {
						if(m.getValue()==id)
						hmap.remove(m.getKey());
					}
					System.out.println("Hash Map after deleting employee details:\n");
					for(HashMap.Entry<String, Employee> m : hmap.entrySet()) {
						System.out.println(m.getValue());
					}
					break;
			default : System.out.println("Invalid choice..Enter Again..");
			}
			System.out.println();
			System.out.print("Do you want to continue?(y/n) ");
			ch=ip.next().charAt(0);
		}
		ip.close();
	}
}