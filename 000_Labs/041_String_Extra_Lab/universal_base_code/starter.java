/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter your sentence: ");
	    String sentence = sc.nextLine();
	    String full = "";
	    while(true){
	        if(sentence.indexOf(" ") == -1){
	        	full = sentence + " " + full;
	            break;
	        }
	        int space = sentence.indexOf(" ");
	        String word = sentence.substring(0, space);
	        sentence = sentence.substring(space + 1);
	        full = word + " " + full;
	    }
		System.out.print(full);

		
	}
}
