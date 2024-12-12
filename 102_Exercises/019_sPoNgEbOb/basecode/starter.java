/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    System.out.println("Enter your sentence: ");
    String sentence = sc.nextLine();
    while(true){
        if(sentence.indexOf(" ") == -1){
            System.out.print(spongeCase(sentence));
            break;
        }
        int space = sentence.indexOf(" ");
        String word = sentence.substring(0, space);
        System.out.print(spongeCase(word) + " ");
        sentence = sentence.substring(space + 1);
    }
	}
	public static String spongeCase(String input){
	String sentance = "";
    for(int i = 0; i < input.length(); i++){
    	String x = input.substring(i, i + 1);
    	if(i % 2 == 0){
    		x = x.toLowerCase();
    	}
    	else{
    		x = x.toUpperCase();
    	}
    	sentance = sentance + x;
    }
    return sentance;
	}
}
