/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 2 numbers to get a random range");
	System.out.print("enter the first integer: ");
	int num1 = sc.nextInt();
	System.out.print("enter the second integer(bigger then first): ");
	int num2 = sc.nextInt();
	System.out.println("your range is " + num1 + " to " + num2 + ".");
	System.out.print((int)(Math.random() * (num2-num1))+num1 + ", ");
	System.out.print((int)(Math.random() * (num2-num1))+num1 + ", ");
	System.out.print((int)(Math.random() * (num2-num1))+num1 + ", ");
	System.out.print((int)(Math.random() * (num2-num1))+num1 + ", ");
	System.out.print((int)(Math.random() * (num2-num1))+num1);
	}
}
