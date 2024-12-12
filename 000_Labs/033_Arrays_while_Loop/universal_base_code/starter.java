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
		int c = 0;
		int i = 0;
		 while (i < arr.length) {
    		c = (int)(Math.random()*1000);
    		arr[i] = c;
    		System.out.print(arr[i] + ", ");
    		i++;

		}

		
	}
}
