// package JAVA.T.3_User Input;
import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
        System.out.println("Taking values from user input");
        Scanner sc = new Scanner(System.in); 
        /* 
         * here inpuit is a variable we can replace input with a , b, cdf, etc
         * and 
         */
        // System.out.println("Enter the first element:");
        // int a = sc.nextInt();
        // System.out.println("Enter the second element:");
        // int b = sc.nextInt();
        // System.out.println("Enter the third element:");
        // int c = sc.nextInt();
        // int sum = a + b + c ;
        // System.out.println("The sum is: " + sum);
        
        String str = sc.nextLine();
        System.out.println("The string is: " + str);
        sc.close();
    }
}
