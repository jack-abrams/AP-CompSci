/*
 *	Author: Jack Abramsssssssssssss
 *  Date: 9/30
 * 	Collaborator(s): 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	   Scanner sc = new Scanner(System.in);
	   int balance = 100;
	   System.out.print("Slot Machine Rules: \n1. Each player starts with $100.\n2. Input a wager less than your total amount of money.\n3. The slot machine will roll 3 numbers from 1 to 10.\na. If two numbers match, you double your money.\nb. If three numbers match, you triple your money.\nc. If none match, you lose your money.\n--------------------------------------------------\n"); 
	   System.out.print("Do you want to spin(Yes, yes, Y, y, No, no, N, or n: ");
		String answer = sc.nextLine();
	if(answer.equals("Yes") || answer.equals("yes") || answer.equals("Y") || answer.equals("y")){
	   while (true) {
            if (balance <= 0) {
                System.out.println("You're out of money! Game over.");
                break;
            }
            
            	System.out.print("You have $" + balance + " Enter your wager: $");
            	int wager = sc.nextInt();
            	if (wager <= 0 || wager > balance) {
                	System.out.println("Invalid wager. Please enter a wager between 1 and " + balance + ".");
            	}
            	else{
            		balance = balance - wager;
            		int num1 = (int) (Math.random() * 10);
					int num2 = (int) (Math.random() * 10);
					int num3 = (int) (Math.random() * 10);
					System.out.print("|             |\n|             |\n|"+ " " + num1 + "    " + num2 + "    " + num3 + " " + "|\n|             |\n|             |\n");
					if (num1  == num2 && num2 == num3) {
                	System.out.println("You won $" + (wager * 3) + "\n You now have $" + (balance + wager * 3));
                	balance = balance + wager*3;
					}
					else if(num1  == num2 || num2 == num3 || num1 == num3){
                	System.out.println("You won $" + (wager * 2) + "\n You now have $" + (balance + wager * 2));
                	balance = balance + wager*2;
					}
					else{
                	System.out.println("You lost $" + wager + "\n You now have $" + balance);
					}
					}
				}
			
}
	if(answer.equals("No") || answer.equals("no") || answer.equals("N") || answer.equals("n")){
					System.exit(0);
}
	else{
		System.out.print("please enter a valid response");
	}
}
}
 