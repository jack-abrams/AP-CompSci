/*
 *	Author:  jack abrams
 *  Date: 10/24/24
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		BaseClass a = new BaseClass();
		a.setRole("wizard");
		a.setStrength(5);
		a.setDexterity(6);
		a.setIntelligence(7);
		a.setCharisma(3);
		a.myToString();
	}
}
