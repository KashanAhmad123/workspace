package com.emp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeList {
	
	private ArrayList<EmployeeDetails> employees;
	
	public EmployeeList() {
		
	employees=new ArrayList<>();
	
	}
	
	public void addEmployees(String name,int salary,int age) {
		
		 employees.add(new EmployeeDetails(name,salary,age));
		
	}
	
	public void sortBySalary() {
		Collections.sort(employees, new Comparator<EmployeeDetails>(){

			@Override
			public int compare(EmployeeDetails o1, EmployeeDetails o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getSalary(), o2.getSalary());
			}
			
			
		});
	}
	
	public void sortByAge() {
		Collections.sort(employees, new Comparator<EmployeeDetails>() {

			@Override
			public int compare(EmployeeDetails o1, EmployeeDetails o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.getAge(), o2.getAge());
			}
			
		});
	}
	
	public void displayEmployee() {
		for(EmployeeDetails emp:employees)
		System.out.println(emp);
	}
	

}
