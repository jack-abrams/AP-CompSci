/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        int [] arr = {5, 8, 7, 8, 4, 4, 9, 1};
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + " ");
        }
        int x = 8;
        for(int i = 0; i < arr.length - 1; i++){
            if(x == arr[i]){
                System.out.print(i);
            }
        }
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                System.out.print(i + "th index is equal to index " + (i + 1));
            }
        }
	}
}