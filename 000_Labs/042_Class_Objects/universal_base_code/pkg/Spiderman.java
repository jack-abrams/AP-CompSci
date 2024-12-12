/*
 *	Author:  Jack Abrams
 *  Date: 11/17/24
*/

package pkg;
import java.util.*;

public class Spiderman {
	String actor;
	int age;
	String villain;
public Spiderman() {
	actor = "Miles Morales";
	age = 13;
	villain = "King Pin";
}
public Spiderman(String a){
	actor = a;
	age = 0;
	villain = "none";
}
public Spiderman(String a, int ac){
	actor = a;
	age = ac;
	villain = "none";
}
public Spiderman(String a, String v){
	actor = a;
	age = 0;
	villain = v;
}
	public void print(){
		System.out.println("---------------------------------------------------------------");
		System.out.print("The actor " + actor + " is " + age + " years old. \n They play Spiderman whos villain is " + villain + "\n");
		System.out.println("---------------------------------------------------------------");
		System.out.println();
	}
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
}

