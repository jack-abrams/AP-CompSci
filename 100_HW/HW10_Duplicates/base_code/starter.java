/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
    public static void main(String args[]) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 10) + 1;
        }
        int target = (int)(Math.random() * 10) + 1;
        System.out.println("Target number: " + target);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                count++;
                System.out.println("Duplicate found at index: " + i);
            }
        }
        System.out.print("These are the numbers in the array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("The number " + target + " appeared " + count + " times.");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i]-arr[i + 1] == 0) {
                System.out.println("Consecutive numbers found at index " + (i + 1) + " and " + (i + 2) + ": " + arr[i] + " and " + arr[i]);
            }
        }
    }
}
