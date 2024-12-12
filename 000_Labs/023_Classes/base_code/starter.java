/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;
class Character{
	String wizard = new String("Wizard");
	int strength = 100;
	int dexterity = 100;
	int intelligence = 100;
	int charisma = 100;
}
class starter {
	public static void main(String args[]) {
		Character myCharacter = new Character();
		System.out.println("your role is " + myCharacter.wizard);
		System.out.println("your strength is " + myCharacter.strength);
		System.out.println("your dexterity is " + myCharacter.dexterity);
		System.out.println("your intelligence is " + myCharacter.intelligence);
		System.out.println("your charisma is " + myCharacter.charisma);
	}
}
