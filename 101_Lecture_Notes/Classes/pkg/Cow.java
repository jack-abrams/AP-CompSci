/* 
    Lecture note example - Classes
*/
package pkg;

public class Cow{
    int numberSpots;
    String flavor;
    boolean isBeef;
    int moosPerHour;
    
    public Cow(){
        numberSpots = 17;
        flavor = "Waygu";
        isBeef = false;
        if(isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
    }
    
    public Cow(int n, String f, boolean b){
        numberSpots = n;
        flavor = f;
        isBeef = b;
        if(isBeef)
            moosPerHour = 0;
        else
            moosPerHour = 87;
    }
    public String getFlavor(){
        return flavor;
    }
    public void moo(){
        if(!isBeef){
            int c = 0;
            while(c < moosPerHour){
                System.out.println("MOOOOO");
                c++;
            }
        }
        else
            System.out.println("your " + flavor + " cow is beef");
    }
}