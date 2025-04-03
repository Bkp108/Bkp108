// package 2_PRIME_NUMBER;
import java.util.*;

public class Prime_no1 {
    public static boolean isprime(int j) {
        if (j <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(j); i++) {
            if (j % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void range(int a) {
        for(int j=0; j<=a; j++){
            if(isprime(j)){
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        sc.close();
        System.out.println("");
        range(a);
        

    }
}

// import java.util.*;

// public class Prime_no1 {
// public static boolean isPrime(int a) {
// if (a <= 1) {
// return false;
// }
// for (int i = 2; i <= Math.sqrt(a); i++) {
// if (a % i == 0) {
// return false;
// }
// }
// return true;
// }

// public static void main(String[] args) {
// System.out.println("Enter the number: ");
// Scanner sc = new Scanner(System.in);
// int a = sc.nextInt();
// sc.close();

// if (isPrime(a)) {
// System.out.println("Yes");
// } else {
// System.out.println("No");
// }
// }
// }
