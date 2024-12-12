/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
		public static void main(String args[]) {
		int rand1 = (int)(Math.random() * 1000) + 1;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your guess(1-1000): ");
		int num1 = sc.nextInt();
		if(num1 == rand1){
			System.out.print("You guessed it! the number was " + rand1);
		}
		else if(num1 < rand1){
			System.out.print("Your number was smaller then the number. the number was " + rand1);
		}
		else if(num1 > rand1){
			System.out.print("Your number was bigger then the number. the number was " + rand1);
		}
	}
}
