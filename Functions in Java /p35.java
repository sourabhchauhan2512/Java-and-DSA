import java.util.*;

public class main { 
public static void main(String[] args) {

    int positive = 0;
    int negative = 0; 
    int zero = 0;

    Scanner sc = new Scanner(System.in);
    char choice;

    do {

        int n = sc.nextInt();

        if(n>0) {
            positive++;
        }
        else if(n<0) {
            negative++;
        }
        else {
            zero++;
        }

        System.out.println("Do you want to continue? (y/n)");
        choice = sc.next().charAt(0);
 
    } while(choice == 'y');

    System.out.println("Positive" + positive);
    System.out.println("Negative" + negative);
    System.out.println("Zero" + zero);

    }
}
