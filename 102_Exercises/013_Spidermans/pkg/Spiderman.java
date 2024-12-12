package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	// Create constructors for each combination of actor/age/villain. Use the defaults above if not an input parameter.
public Spiderman(){
	actor = "unknown";
	age = 0;
	villain = "unknown";
}
	// String Actor constructor! 			Age - 0, Villain Unknown 
public Spiderman(String a){
	actor = a;
	age = 0;
	villain = "unknown";
}
	// int Age constructor! 				Actor - Unknown, Villain Unknown
public Spiderman(int a){
	actor = "unknown";
	age = a;
	villain = "unknown";
}

	// String Actor, int Age constructor! 	Villain Unknown
public Spiderman(String a, int ag){
	actor = a;
	age = ag;
	villain = "unknown";
}
	// String Actor, int Age, String Villain constructor!		
public Spiderman(String a, int ag, String v){
	actor = a;
	age = ag;
	villain = v;
}
	// ---------------------------------------
	// Create accessor and mutator methods for actor, age, and villain (6 total methods)
	public String getActor(){
		return actor;
	}
	public void setActor(String a){
		actor = a;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getVillain(){
		return villain;
	}
	public void setVillain(String v){
		villain = v;
	}
	// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
