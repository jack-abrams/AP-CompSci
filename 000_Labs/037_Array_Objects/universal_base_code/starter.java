/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] Wizard = new Wizard[100];
		Warrior[] Warrior = new Warrior[100];
		for(int i = 0; i < 100; i++){
		Wizard[i] = new Wizard();
		Warrior[i] = new Warrior();
		}
		int n = Wizard.length - 1;
		int m = Warrior.length - 1;
		int a = 10000;
		while(true) {
			if(a % 2 == 0){
				Wizard[n].attack(Warrior[m]);
				a--;
			}
			else{
				Warrior[m].attack(Wizard[n]);
				a--;
			}
			if(Wizard[n].isDead()){
				n = n - 1;
				}
			if(Warrior[m].isDead()){
				m = m - 1;
				}
			if(n == 0){
				System.out.print("Warriors win with " + m + " Warriors left");
				break;
			}
			if(m == 0){
				System.out.print("Wizard win with " + n + " Wizard left");
				break;
			}
		}
	}
}
