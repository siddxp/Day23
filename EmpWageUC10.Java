package com.company;
public class EmpWageUC10 {
	public static void main(String[] args) {
		  System.out.println("Welcome Employee "+ "\n");
		  EmpWageBuilder employeeWageArray = new EmployeeWageArray();
        employeeWageArray.addCompanyToArray("D-Mart", 10, 10,10);
        employeeWageArray.addCompanyToArray("Reliance", 20, 20,20);
        employeeWageArray.computeEmpWage();
	}
}
