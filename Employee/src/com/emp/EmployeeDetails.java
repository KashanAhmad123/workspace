package com.emp;

public class EmployeeDetails {
	
	private String name;
	private int salary;
	private int age;
	
	EmployeeDetails(String name, int salary,int age){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public int getAge() {
		return age;
	}
	
	public String toString() {
		
		return (" Name:" +name+ " ,Salary: $" +salary+ ", Age:" +age);
		
	}
	

}
