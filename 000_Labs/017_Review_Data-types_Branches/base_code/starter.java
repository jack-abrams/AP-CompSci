/*
 *	Author:  Jack Abrams
 *  Date: 9/23/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		int points = 20;
		Scanner sc = new Scanner(System.in);
		System.out.print("What is your character name:\n");
		String name = sc.nextLine();
		System.out.print("What is your title:\n");
		String title = sc.nextLine();
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
		
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma.");
		System.out.print("Strength (1-10): ");
		int Strength = sc.nextInt();
		if (points>0){
		points = points - Strength;
		}
		if(points<0){
			System.out.print("Not enough points left");
		}
		if(Strength>10 || Strength<0){
			System.out.print("pick a number between 1-10");
		}
		System.out.println("you have " + points + " points left");
		System.out.print("Dexterity (1-10): ");
		int Dexterity = sc.nextInt();
		if (points>0){
		points = points - Dexterity;
		}
		if(points<0){
			System.out.print("Not enough points left");
		}
		if(Dexterity>10 || Dexterity<0){
			System.out.print("pick a number between 1-10");
		}
		System.out.println("you have " + points + " points left");
		System.out.print("Intelligence (1-10): ");
		int Intelligence = sc.nextInt();
		if (points>0){
		points = points - Intelligence;
		}
		if(points<0){
			System.out.print("Not enough points left");
		}
		if(Intelligence>10 || Intelligence<0){
			System.out.print("pick a number between 1-10");
		}
		System.out.println("you have " + points + " points left");
		System.out.print("Charisma (1-10): ");
		int Charisma = sc.nextInt();
		if (points>0){
		points = points - Charisma;
		}
		if(points<0){
			System.out.print("Not enough points left");
		}
		if(Charisma>10 || Charisma<0){
			System.out.print("pick a number between 1-10");
		}
		System.out.println("you have " + points + " points left");
		System.out.println("you are " + name + " the " + title);
		System.out.println("you are a " + role + " with the following stats");
		System.out.println("Strength - " + Strength);
		System.out.println("Dexterity - " + Dexterity);
		System.out.println("Intelligence - " + Intelligence);
		System.out.println("Charisma - " + Charisma);
	}
}
