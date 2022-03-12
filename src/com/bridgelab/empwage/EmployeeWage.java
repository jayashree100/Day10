package com.bridgelab.empwage;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	int fullDayHr;
	int empWagePerHr;

	public EmployeeWage() {
		super();
	}

	public EmployeeWage(int fullDayHr, int empWagePerHr) {
		this.fullDayHr = fullDayHr;
		this.empWagePerHr = empWagePerHr;

	}

	@Override
	public String toString() {
		return "EmployeeWage [fullDayHr=" + fullDayHr + ", empWagePerHr=" + empWagePerHr + "]";
	}

	public void randomCheck() {
		Random random = new Random();
		int rand = random.nextInt(2);

		if (rand == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is absent");

	}

	public void getFullWage() {
		int empWage = empWagePerHr * fullDayHr;
		System.out.println("Per day  Full Time Employeewaage is :" +empWage);
	}

	public static void main(String args[]) {
		System.out.println("Wel come to Employeewage computation");
		
		EmployeeWage emp1 = new EmployeeWage();
        EmployeeWage emp = new EmployeeWage(8, 20);
        emp.getFullWage();
        emp1.randomCheck();
	

	}

}
