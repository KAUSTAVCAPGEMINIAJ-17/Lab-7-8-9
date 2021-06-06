package Service;

import java.util.Scanner;

import com.capgemini.Employee.idSalary.bean.Employee;

interface EmployeeService{
	void readEmpDetails();
	void displayEmpDetails();
}
public class EmployeeServiceClass extends Employee implements EmployeeService{
	Employee emp=new Employee();
	@Override
	public void readEmpDetails() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter emp id= ");
		emp.setId(sc.nextInt());
		System.out.println("Enter emp name=");
		emp.setName(sc.next());
		System.out.println("Enter emp salary= ");
		emp.setSalary(sc.nextDouble());
		System.out.println("Enter the designation of emp=");
		emp.setDesignation(sc.next());
		
		sc.close();
	}

	@Override
	public void displayEmpDetails() {
		// TODO Auto-generated method stub
		emp.setInsuranceScheme("No Scheme");
		if((emp.getSalary()>=5000 && emp.getSalary()<20000) && emp.getDesignation().equalsIgnoreCase("System Associate"))
			emp.setInsuranceScheme("Scheme C");
		else if((emp.getSalary()>=20000 && emp.getSalary()<40000) && emp.getDesignation().equalsIgnoreCase("Programmer"))
			emp.setInsuranceScheme("Scheme B");
		else if(emp.getSalary()>=40000 && emp.getDesignation().equalsIgnoreCase("Manager"))
			emp.setInsuranceScheme("Scheme A");
		else if(emp.getSalary()<5000 && emp.getDesignation().equalsIgnoreCase("Clerk"))
			emp.setInsuranceScheme("No Scheme");
		System.out.println("Employee id\tName\tSalary\tDesignation\tInsurance scheme");
		System.out.println("========================================================");
		System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getSalary()+"\t"+emp.getDesignation()+"\t"+emp.getInsuranceScheme());
	}

	

}

