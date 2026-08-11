import java.util.*;

public class main {

    public static double cir(double radius) {
        return 2 * Math.PI * radius; 
    }

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);   
    int r = sc.nextInt();

    System.out.println(cir(r));
    }
}
