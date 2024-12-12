/*
 *	Author:  jack abrams
 *  Date: 10/24/24
 * Collaberator: Isaac Porath a tiny bit, (he was in discord call with me)
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


 public class BaseClass {
	 String role;
	 int Strength;
	 int Intelligence;
	 int Dexterity;
	int Charisma;
	
	public BaseClass(){
		role = "none";
		Strength = 0;
		Intelligence = 0;
		Dexterity = 0;
		Charisma = 0;
	}
	
	public BaseClass(String r, int s, int d, int i, int c){
		role = r;
		Strength = s;
		Intelligence = i;
		Dexterity = d;
		Charisma = c;
	}
	public String setRole(String a) {
		Scanner sc = new Scanner(System.in);
		if(a.equals("wizard") || a.equals("Wizard")){
			role = a;
		}
		else if(a.equals("warrior") || a.equals("Warrior")){
			role = a;
		}
		else if(a.equals("rogue") || a.equals("Rogue")){
			role = a;
		}
		else{
			System.out.print("Invalid class");
		}
		return a;
	}
	public int setStrength(int a){
		if(a < 0){
			System.out.print("invalid Strength");
		}
		Strength = a;
		return Strength;
	}
	public int setDexterity(int a){
		if(a < 0){
			System.out.print("invalid Dexterity");
		}
		Dexterity = a;
		return Dexterity;
	}
	public int setIntelligence(int a){
		if(a < 0){
			System.out.print("invalid Intelligence");
		}
		Intelligence = a;
		return Intelligence;
	}
	public int setCharisma(int a){
		if(a < 0){
			System.out.print("invalid Charisma");
		}
		Charisma = a;
		return Charisma;
	}
	public void myToString(){
	System.out.println("------------------------------");
	System.out.println("Your Role: " + role);
	System.out.println("Your Strength: " + Strength);
	System.out.println("Your Dexterity: " + Dexterity);
	System.out.println("Your Intelligence: " + Intelligence);
	System.out.println("Your Charisma: " + Charisma);
	System.out.println("------------------------------");
	System.out.println("");
	}
}


