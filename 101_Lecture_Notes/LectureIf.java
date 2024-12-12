/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("you have joined an alien exchange program");
        System.out.println("pick an alien");
        System.out.println("1. joe, a fat bellied alien who loves eating pizza");
        System.out.println("2. bob, a blue alien who loves trees");
        System.out.println("3. barney, a purple tailed alien who eats butterflies");
        int answer1 = sc.nextInt();
        if(answer1 = 1){
            System.out.println("You picked joe!!!!");
            System.out.println("joe starts going through your fridge");
            System.out.println("1. close the fridge");
            System.out.println("2. let joe go through your fridge");

        }
        else if(answer1 = 2){
            System.out.println("you picked bob!!!!!");
        }
        else if(answer1 = 3){
            System.out.println("You picked barney!!!!");
        }
        else{
            System.out.println("you get jerry");
        }
	}
}