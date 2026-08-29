import java.util.*;

public class arrays {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       int number[] = new int[size];

       //take input numbers
       for(int i=0; i<size; i++) {
           number[i] = sc.nextInt();
       }

       int max = number[0];
       int min = number[0];

       //find max and min no.
       for(int i=1; i<size; i++) {

        //for max no.
        if(number[i] > max) {
            max = number[i];
        } 
        
        //for min no.
        if(number[i] < min) {
            min = number[i];
        } 

        }

        System.out.println("Largest no. is : " + max);
        System.out.println("Smallest no. is : " + min);
    }
}
