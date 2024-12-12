/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int c = 0;
		double grade = 0.0;
		double totalgrade = 0.0;
		while(true){
			if(c<5){
				System.out.print("enter your grade: ");
				grade = sc.nextDouble();
				totalgrade = totalgrade + grade;
				c = c + 1;
			}
			else{
				System.out.print("your average grade is " + (totalgrade/5.0));
				break;
			}
				
			}
		}
	}

