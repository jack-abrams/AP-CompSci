/*
 *	Author: Jack Abrams
 *  Date: 10/13/24
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.print("enter the number you want to see every prime number before it: ");
	printPrimes(sc.nextInt());
	}
	public static boolean checkPrime(int a) {
    if (a <= 1) {
        return false;
    }
    int divide = 2;
    while (divide < a) {
        if (a % divide == 0) {
            return false;
        }
        divide = divide + 1;
    }
    return true;
}
	public static void printPrimes(int b) {
    int num = 2;
    while(num <= b) {
    	if(checkPrime(num)) {
    		System.out.println(num);
    	}
    	num = num + 1;
      }
	}
}
