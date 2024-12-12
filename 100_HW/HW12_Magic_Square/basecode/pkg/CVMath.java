package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three){
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static boolean isSum(int num){
        int sum = 0;
        int c = 1;
        while (sum < num) {
            sum = sum + c;
            c++;
        }
        if(sum == num){
        	return true;
        }
        else{
        	return false;
        }
    }
    
     public static void specialSquare(int num) {
        int count = 1;
        int c = 0;
        while(c < num){
            if(isSum(count)){
                int sqrt = (int)Math.sqrt(count);
                if(sqrt * sqrt == count){
                    System.out.println(count);
                    c++;
                }
            }
        count++;
        }
    }
    
    
	
}
