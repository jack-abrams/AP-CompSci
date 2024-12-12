/*
 *	Author:  jack abrams
 *  Date: 11/17/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your first and last name with a space in the middle (ex: Jack Abrams): ");
		String name = sc.nextLine();
		System.out.println("Last name is: " + name.substring(name.indexOf(" ") + 1));
	}
}
