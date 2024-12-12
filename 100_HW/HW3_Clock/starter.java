/*
 *	Author: jack abrams
 *  Date: 9/20/24
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it? (0 = Sunday, 1 = Mon, 2 = Tue, 3 = Wed, 4 = Thur, 5 = Fri, 6 = Sat:");
		int day = sc.nextInt();
		if (day >= 1 && day <= 5) {
            System.out.println("It's a weekday, time is 7am.");
        }
        else if (day == 0 || day == 6) {
            System.out.println("Its a weekend, time is 10am.");
		}
		else{
			System.out.print("invalid number");
		}
	}
}
