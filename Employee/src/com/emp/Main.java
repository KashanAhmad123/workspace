package com.emp;

public class Main {
	
	public static void main(String args[]) {
		
		EmployeeList emp= new EmployeeList();
		
		emp.addEmployees("AKKII",200000,23);
		emp.addEmployees("DDOO", 300000, 31);
		emp.addEmployees("HHIIOO", 200000, 22);
		
		System.out.println("Original List");
		
		emp.displayEmployee();
		
		System.out.println("Sort By Age");
		
		emp.sortByAge();
		emp.displayEmployee();
		
		System.out.println("Sorted By Pay");
		
		emp.sortBySalary();
		emp.displayEmployee();
		
		
	}

}
