// package JAVA.T.5_StringInJava;
import java.util.Scanner;
public class String1 {
    public static void main(String[] args){

        /*
         * In JAVA 'STRING' is a class not a data type
         * Simaler to the 'SCANNER FUNCTION' where we are giving 'new' methods to create a new 
         * SAME in 'String' we give 'new' method
         * 
         * String is a sequence of characters, define as::
         * String string_name = new String("........");
         */
        String Vishnu = new String("Ram");  // ONE METHOD TO DEFINE A STRING
        String Shiv ="OM";                           // SECOND METHOD TO DEFINE A STRING
        System.out.println(Vishnu +" + "+ Shiv );

        int a = 3;
        float b = 1.0f;
        System.out.printf("The value of a is %d and The value of b is %f \n", a, b );
/*
 * Different ways to 'PRINT' in java::
 * 1. print() --> No new line
 * 2. println() --> new line before print
 * 3. printf()
 * 4. formate() 
 */


/*
 * Syste.out.printf('..........', .............)
 *                      %c    char     
 *                      %d    int
 *                      %f    float
 *                      %s    string
 */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String st = sc.nextLine();
        System.out.println("The String is: "+st);
        sc.close();
    }

}
