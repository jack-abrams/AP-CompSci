/*
 *	Author:  Jack Abrams
 *  Date: sep 11 24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your name:\n");
		String name = sc.nextLine();
		System.out.print("What is your age:\n");
		int age = sc.nextInt();
		System.out.print("What month were you born: (1-12)\n");
		int month = sc.nextInt();
		System.out.print("What day were you born:\n");
		int day = sc.nextInt();
		System.out.print("What year were you born:\n");
		int year = sc.nextInt();
		System.out.print("If I have a dollar and two quarters, how much money would I have?\n");
		double money = sc.nextDouble();
		System.out.print("Your name is " + name + " and you were born on " + month + "/" + day + "/" + year + "\n");
		System.out.print("you are " + age + " years old\n");
		System.out.print("a dollar and two quarters = " + money);
		
	}
}
