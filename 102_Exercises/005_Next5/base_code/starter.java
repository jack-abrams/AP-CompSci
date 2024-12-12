/*
 *	Author: jack abrams
 *  Date: sep 11 24
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter a number: ");
        int num = sc.nextInt();
        System.out.print("here are the next five numbers:\n" + (num + 1) + " " + (num + 2) + " " + (num + 3) + " " + (num + 4) + " " + (num + 5) + "\n");
        System.out.print("here are the next five multiples of " + num + "\n" + (num * 1) + " " + (num * 2) + " " + (num * 3) + " " + (num * 4) + " " + (num * 5) + "\n");
		double number = num;
		System.out.print("here is " + num + " divided by 100: \n" + (number/100) + "\n");
		System.out.print("here is " + num + " divided by 10: \n" + (number/10));
	}
}
