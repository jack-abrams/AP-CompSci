/*
 *	Author: jack abrams
 *  Date: 10/25/24
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Dog dog1 = new Dog("Lebron");
		Dog dog2 = new Dog("Bronny", "Goat");
		boolean x = dog1.isSleeping();
		if(x == true){
			System.out.print(dog1.getName() + " is asleep");
		}
		else{
			dog1.bark();
		}
		   if (dog2.isSleeping()) {
            	if (x == false) {
                	dog2.bark();
            }
        } else {
            	if (x == false) {
                	dog2.bark();


	}
}
}
}
