/*
 *	Author:  Jack Abrams
 *  Date: 9/17/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the first integer: ");
		int num1 = sc.nextInt();
		System.out.print("Enter the first integer: ");
		int num2 = sc.nextInt();		
		System.out.println("the first number is " + num1);
		System.out.println("the second number is " + num2);
		if(num1!=num2)
		{
			System.out.print("the numbers are different");
		}
	}
}
