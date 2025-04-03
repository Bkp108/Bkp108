// package JAVA.T.13_Recurssion;
import java.util.Scanner;
public class FactorialByRecurssion{
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1); 
        }

    }
    public static void main(String[] args) {
        System.out.println("Enter the number you want to find the factorial:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.printf("The Factorial is: "+factorial(n));
        sc.close();
    }
    
}
