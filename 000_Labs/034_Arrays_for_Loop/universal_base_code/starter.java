/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int arr[] = new int[1001];
		 for (int i = 0;i < arr.length; i++) {
    		int c = (int)(Math.random()*1000);
    		arr[i] = c;
    		System.out.print(arr[i] + ", ");

		}


		
	}
}
