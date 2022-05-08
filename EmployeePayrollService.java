package com.bridgelab.employeePayroll;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {
	private List<EmployeePayrollData> employeePayrollList;

	public EmployeePayrollService() {}

	public EmployeePayrollService(List<EmployeePayrollData> employeePayrollList) { 
		this.employeePayrollList = employeePayrollList;
	}

	public static void main(String[] args) {
		ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<>();
		EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);
		Scanner scanner = new Scanner(System.in);
		employeePayrollService.readEmpPayrollData(scanner);
		employeePayrollService.writeEmpPayrollData();
	}

	private void readEmpPayrollData(Scanner scanner) {
		//Scanner scanner = new Scanner(System.in);
		EmployeePayrollData employeePayrollData;
		System.out.println("Enter employee id : ");
		String empId = scanner.next();
		System.out.println("Enter employee name :");
		String empName = scanner.next();
		System.out.println("Enter employee salary : ");
		double empSalary = scanner.nextDouble();
		
		employeePayrollList.add(new EmployeePayrollData(empId, empName, empSalary));
		
	}

	private void writeEmpPayrollData() {
		System.out.println("Writing employee payroll on console : \n" + employeePayrollList);
		
	}
}
