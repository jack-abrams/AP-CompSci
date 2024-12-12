/*
 *	Author:  jack abrams
 *  Date: 10/11/24
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your base number:");
    int base = sc.nextInt();
	System.out.println("Enter your exponent number:");
    int exponent = sc.nextInt();
    int result = pow(base, exponent);
    System.out.print("your answer is " + result);


	}
	public static int pow(int a, int b){
		int c = 0;
		int result = 1;
		while(c < b){
			result = result * a;
			c = c + 1;
		}
		return result;
	}
}
