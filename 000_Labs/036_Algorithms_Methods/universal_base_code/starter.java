/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		int arr[] = new int[99];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		toStringArray(arr);
		System.out.println("Average: " + getArrayAverage(arr));
        System.out.println("Max: " + getArrayMax(arr));
        System.out.println("Min: " + getArrayMin(arr));
	}
	public static void toStringArray(int[] a) {
	for (int i = 0;i < a.length; i++) {
    		System.out.println(a[i] + " ");
		}
	}
	public static int getArrayAverage(int[] b) {
	int sum = 0;
		for (int i = 0; i < b.length; i++) {
			sum = sum + b[i];
		}
	return (sum/b.length);
	}
	public static int getArrayMax(int[] c) {
		int max = Integer.MIN_VALUE;
		 for (int i = 0;i < c.length; i++) {
    		if(c[i] > max){
    			max = c[i];
    		}
		}
		return max;
	}
	public static int getArrayMin(int[] d) {
		int min = Integer.MAX_VALUE;
		 for (int i = 0; i < d.length; i++) {
    		if(d[i] < min){
    			min = d[i];
    		}
		}
		return min;
	}
}
