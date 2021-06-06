package com.capgemini.Employee.idSalary.bean;

/**
 * 
 * @author Kaustav
 *
 */
public class Employee {
	public int id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;

	/**
	 * default constructor
	 */
	public Employee() {
		super();
	}

	/**
	 * 
	 * @param id              for emp id
	 * @param name            for emp name
	 * @param salary          for emp salary
	 * @param designation     for emp designation
	 * @param insuranceScheme for insurance scheme of emp
	 */

	public Employee(int id, String name, double salary, String designation, String insuranceScheme) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme = insuranceScheme;
	}

	/**
	 * 
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return salary
	 */
	public double getSalary() {
		return salary;
	}

	/**
	 * 
	 * @param salary
	 */

	public void setSalary(double salary) {
		this.salary = salary;
	}

	/**
	 * 
	 * @return designation
	 */

	public String getDesignation() {
		return designation;
	}

	/**
	 * 
	 * @param designation
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * 
	 * @return scheme
	 */
	public String getInsuranceScheme() {
		insuranceScheme="No Scheme";
		if((salary>=5000 && salary<20000) && designation.equalsIgnoreCase("System Associate"))
			insuranceScheme="Scheme C";
		else if((salary>=20000 && salary<40000) && designation.equalsIgnoreCase("Programmer"))
			insuranceScheme="Scheme B";
		else if(salary>=40000 && designation.equalsIgnoreCase("Manager"))
			insuranceScheme="Scheme A";
		else if(salary<5000 && designation.equalsIgnoreCase("Clerk"))
			insuranceScheme="No Scheme";
		return insuranceScheme;
	}

	/**
	 * 
	 * @param insuranceScheme
	 */
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	/**
	 * Overriding to string method of object class
	 */
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation
				+ ", insuranceScheme=" + insuranceScheme + "]";
	}

}