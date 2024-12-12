/*
 *	Author:  jack abrams
 *  Date: 9/24/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name:");
		String name = sc.nextLine();
		System.out.println("How many times should your name be printed?");
		int num = sc.nextInt();
		int c = 0;
		while(true){
			System.out.println(name);
			if(c == num){
				break;
			}
			c = c + 1;
		}



		
	}
}
