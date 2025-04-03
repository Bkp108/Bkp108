
// package 1_Binomial_cofficient;
import java.util.*;

public class BINOMIAL_COFFICIENT_USERINPUT {
    public static int Binomialcofficient(int n, int r) {
        int fn = fact(n);
        int fr = fact(r);
        int fc = fact(n - r);

        int coefficient = fn / (fr * fc);
        System.out.println(coefficient);
        return coefficient;
    }

    public static int fact(int num) {
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        Binomialcofficient(n, r);
        sc.close();
    }
}
