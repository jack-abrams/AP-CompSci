/*
 *	Author:
 *  Date:
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "dwight", "Schrute", 4416.66);
		Employee jim = new Employee(1987, "Jim", "Schrute", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		Employee lebron = new Employee(1984, "Lebron", "James", 23.06);
		michael.raiseSalary(10);
		dwight.raiseSalary(10);
		jim.raiseSalary(10);
		pam.raiseSalary(11);
		lebron.raiseSalary(1000);
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		lebron.employeeToString();
	}
}
