/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	String role;
	int strength;
	int dexterity;
	int intelligence;
	int charisma;
	public BaseClass(){
		role = "No role";
		System.out.println("Your role is no role");
		System.out.println("Your Strength is 0");
		System.out.println("Your Dexterity is 0");
		System.out.println("Your Intelligence is 0");
		System.out.println("Your Charisma is 0");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your class(Wizard, Warrior, or Rogue: ");
	}

	public BaseClass(String role) {
		if(role.equals("wizard") || role.equals("Wizard")){
			System.out.println("You are a Wizard!");
			System.out.println("Your Strength is 25");
			System.out.println("Your Dexterity is 30");
			System.out.println("Your Intelligence is 75");
			System.out.println("Your Charisma is 50");
		}
		else if(role.equals("warrior") || role.equals("Warrior")){
			System.out.println("You are a Warrior!");
			System.out.println("Your Strength is 75");
			System.out.println("Your Dexterity is 50");
			System.out.println("Your Intelligence is 10");
			System.out.println("Your Charisma is 50");
		}
		else if(role.equals("rogue") || role.equals("Rogue")){
			System.out.println("You are a Rogue!");
			System.out.println("Your Strength is 25");
			System.out.println("Your Dexterity is 30");
			System.out.println("Your Intelligence is 20");
			System.out.println("Your Charisma is 75");
		}
		else{
			System.out.println("you chose no role, rerun program to choose another");
			System.out.println("Your Strength is 0");
			System.out.println("Your Dexterity is 0");
			System.out.println("Your Intelligence is 0");
			System.out.println("Your Charisma is 0");
		}
		
	}

}

