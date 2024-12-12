/* 
    Lecture note example - Methods
*/

class LectureMethod{
    
    public static void main(String args[]) {
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        printAnimal();
        
        greeting("jack");
        double num = raise(6000.0,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        num = raise(num,6);
        System.out.println(num);
        

	}
	public static double raise(double salary, int percent){
	   double amount = salary + (salary * (percent/100.0));
	   return amount;
	}
	
	public static void greeting(String name){
	    System.out.println("good riddence " + name);
	    
	    
	}
	
	public static void printAnimal(){
    System.out.println(" __v_");
    System.out.println("(____\\/{");

}
}