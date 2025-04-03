// import java.util.*;

public class BINOMIAL_COFFICIENT {
    public static int Binomialcofficient(int n, int r) {
        int fn = fact_a(n);
        int fr = fact_b(r);
        int fc = fact_c(n, r);

        
            
        int cofficient = fn/(fr*fc);
        System.out.println(cofficient);
        return cofficient;
    }

    public static int fact_a(int n) {
        int fn = 1;
        for (int i = 1; i <= n; i++) { // Change the starting value of i to 1
            fn =fn*i; // Multiply f by i in each iteration
        }
        // System.out.println(fn);
        return fn;
    }

    public static int fact_b(int r) {
        int fr = 1;
        for (int j = 1; j <= r; j++) { // Change the starting value of i to 1
            fr =fr*j; // Multiply f by i in each iteration
        }
        // System.out.println(fr);
        return fr;
    }

    public static int fact_c(int n, int r) {
        int c = n-r;
        int fc = 1;
        for (int k = 1; k <= c; k++) { // Change the starting value of i to 1
            fc =fc*k; // Multiply f by i in each iteration
        }
        // System.out.println(fr);
        return fc;
    }

    public static void main(String[] args) {
        Binomialcofficient(4, 2);
    }
}
