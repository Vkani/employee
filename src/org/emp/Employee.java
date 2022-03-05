package org.emp;

public class Employee {
	private void empId(int age) {
		
System.out.println("Employee age:"+age);
	}
	private void empId(long phoneNumber) {
		System.out.println("Employee PhoneNumber:"+phoneNumber);
	}
	private void empId(short salary) {
		System.out.println("Employee Salary:"+salary);
	}
	public static void main(String[] args) {
		Employee e=new Employee();
		e.empId(30);
		e.empId(9988388576l);
		e.empId(30000);
	}
	}
	
