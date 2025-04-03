// package JAVA.T.13_Recurssion+Factorial;
import java.util.Scanner;
public class FactorialByIterativeApproch {
    static int factorial(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        else{
            int product = 1;
            for(int i =1; i<=n ; i++){
                product *=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to factorial:");
        int x = sc.nextInt();
        System.out.println("The Factorial of x is: "+factorial(x));
    sc.close();
    }

}
