/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static void main(String args[]) {
        int numofsmallppl = 7;
        int count = 0;
        int duplicates = 0;
        int age = 1;
        PooleDwarf Dwarf1 = null;
        PooleDwarf Dwarf2 = null;
        PooleDwarf Dwarf3 = null;
        PooleDwarf Dwarf4 = null;
        PooleDwarf Dwarf5 = null;
        PooleDwarf Dwarf6 = null;
        PooleDwarf Dwarf7 = null;
        while (count < numofsmallppl){
            String name = randName();
            if (count == 0) {
                Dwarf1 = new PooleDwarf(name, age);
            } 
            else if (count == 1){
                Dwarf2 = new PooleDwarf(name, age);
            } 
            else if (count == 2){
                Dwarf3 = new PooleDwarf(name, age);
            } 
            else if (count == 3){
                Dwarf4 = new PooleDwarf(name, age);
            } 
            else if (count == 4){
                Dwarf5 = new PooleDwarf(name, age);
            } 
            else if (count == 5){
                Dwarf6 = new PooleDwarf(name, age);
            } 
            else if (count == 6){
                Dwarf7 = new PooleDwarf(name, age);
            }
            count++;
        }
        String firstDwarfName = Dwarf1.getName();
        if (Dwarf1.isSameName(Dwarf2.getName())){
        	duplicates++;
        }
        if (Dwarf1.isSameName(Dwarf3.getName())){
        	duplicates++;
        }
        if (Dwarf1.isSameName(Dwarf4.getName())){
        	duplicates++;
        }
        if (Dwarf1.isSameName(Dwarf5.getName())){
        	duplicates++;
        }
        if (Dwarf1.isSameName(Dwarf6.getName())){
        	duplicates++;
        }
        if (Dwarf1.isSameName(Dwarf7.getName())){
        	duplicates++;
        }
        System.out.println("first dwarfs name: " + firstDwarfName);
        System.out.println("number of duplicates: " + duplicates);
    }
}