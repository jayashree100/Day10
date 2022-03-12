package com.bridgelab.empwage;

import java.util.Random;
import java.util.Scanner;

public class EmployeeWage {
	public static void main(String args[]) {
		System.out.println("Wel come to Employeewage computation");
		Random random = new Random();
		int rand = random.nextInt(2);

		if (rand == 1)
			System.out.println("Employee is present");
		else
			System.out.println("Employee is Absent");
	}

}
