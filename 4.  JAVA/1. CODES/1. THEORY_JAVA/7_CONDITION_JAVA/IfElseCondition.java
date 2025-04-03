import java.util.Scanner;
public class IfElseCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
         * Age Condition Example
         */
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("You are adult, So you can drive car and bike");
        }
        else if(age == 0){
            System.out.println("Phala peda to ho ja ");
        }
        else{
            System.out.println("Sorry, you can't drive any vehicle ");
        }
        sc.close();
        /*
         * LOGICAL OPERATORS    &&
         * 1. AND Operator
         * both should TRUE THE OVERALL TRUE
         * 
         * 2. OR Operator       ||
         * Atleast one should true then TRUE 
         *
         */

         int a = 4;
         int b = 3;
         int c = 4;

         System.out.println("--------------------------------------------");
         if (a ==c  && c == a ) {
            System.out.println("Here Both condit are TRUE. So, Overall condit true");
         }
         else if (a == b && a == c) {
            System.out.println("Here a one condition is true but one is false. So, OVER ALL FALSE ");
         } 
         else if( a==c || b==c ) {
            System.out.println("Here only one condition is true but we are using OR gate so overall true");
         }
}      
}
