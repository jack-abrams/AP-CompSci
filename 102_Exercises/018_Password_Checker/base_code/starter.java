import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		boolean check1 = false;
		boolean check2 = false;
		int level1 = 0;
		int level2 = 0;
		int level3 = 0;
		String a = new String();
        for(int m = 0; m < passwords.length; m++){
            a = passwords[m];
            if(a.length() >= 8){
                check1 = true;
                level1++;
            }
            else{
                check1 = false;
            }
            if(passwords[m].contains("!") || passwords[m].contains("@") || passwords[m].contains("#") || passwords[m].contains("$") || passwords[m].contains("%") || passwords[m].contains("^") || passwords[m].contains("&") || passwords[m].contains("*")){
                check2 = true;
                level2++;
            }
            else{
                check2 = false;
            }
            if(check1 && check2){
                level3++;
            }
        }
        level2 = level2 - level3;
        level1 = level1 - level3;
        System.out.println("there are " + level1 + " level 1 passwords");
        System.out.println("there are " + level2 + " level 2 passwords");
        System.out.println("there are " + level3 + " level 3 passwords");

	}
}
