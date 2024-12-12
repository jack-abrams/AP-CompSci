/*
 *	Author:  jack abrams
 *  Date: 10/3/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int y = (int) (Math.random() * 1000);
		System.out.println("Guess a number between 1-1000: ");
		int num = sc.nextInt();
		while(true){
			if(y>num){
				System.out.println("Too low, guess again");
				num = sc.nextInt();
			}
			if(y<num){
				System.out.println("Too High, Guess again");
				num = sc.nextInt();
			}
		
			if(y == num){
				System.out.println("Congrats, You guessed it!");
				break;
			}
		}
		}
	}


