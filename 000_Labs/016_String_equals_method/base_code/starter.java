/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your class(Wizard, Warrior, or Rogue: ");
		String role = sc.nextLine();
		if(role.equals("wizard") || role.equals("Wizard")){
			System.out.print("You are a Wizard!");
		}
		else if(role.equals("warrior") || role.equals("Warrior")){
			System.out.print("You are a Warrior!");
		}
		else if(role.equals("rogue") || role.equals("Rogue")){
			System.out.print("You are a Rogue!");
		}
		else{
			System.out.print("Invalid class");
		}
	}
}
