import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		//fyi i think my code is just inefficient because it takes a long time to print after the 5th magic num
		Scanner sc = new Scanner(System.in);
		System.out.print("enter how many magic numbers you want to print: ");
		int input = sc.nextInt();
		CVMath.specialSquare(input);
	}
}
