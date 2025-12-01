package com.neha.learnjava;

public class Employee {
	
	int empId;
	String empName;
	
	
	void setempData(int empId, String empName) {
		int empID = 123;
		this.empId=empID;
		this.empName=empName;
	}
	int getID() {
		return empId;
	}
	String getempName() {
		return empName;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.setempData(10,"john");
		System.out.println(e1.getempName());
		System.out.println(e1.getID());
		
	}

}
