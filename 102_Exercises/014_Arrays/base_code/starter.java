/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		int arr[] = new int[1001];
		int c = 0;
		int i = 0;
		 while (i < arr.length) {
    		c = c + 3;
    		arr[i] = c;
    		System.out.print(arr[i] + ", ");
    		i++;

		}
		int brr[] = new int[1001];
		int e = 1000;
		int f = 0;
		 while (f < arr.length) {
    		arr[f] = e;
    		System.out.print(arr[f] + ", ");
    		f++;
    		e--;
		}
	}
}
