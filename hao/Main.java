
import java.util.Scanner;



public class Main {
   static int f(int n) { return ((n == 0) ? 1 : f(n - 1) + 2);}
    public static void main(String[] args) {
        int x=3;

        System.out.println( f(5));

    }
}
