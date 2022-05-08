package com.bridgelab.employeePayroll;

public class EmployeePayrollData {
	public String empId;
	public String empName;
	public double empSalary;

	public EmployeePayrollData(String empId, String empName, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		
	}

	@Override
	public String toString() {
		return " empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + " ";
	}
}
