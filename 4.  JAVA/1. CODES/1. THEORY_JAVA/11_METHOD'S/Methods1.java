// package JAVA.T.11_MethodsInJava;
import java.util.Scanner;
public class Methods1 {

    /*
     * METHOD:: Somethings our program grows in size and we want to separate the logic of main method
     * to methods
     */
    static int logic(int x, int y){
        int z;
        if( x<y){
            z = x + y;
        }
        else{
            z = x-y;
        }
        return z;
    }

    static void abc(){
        System.out.println("Hello I am Brijesh Kishore Purohit \nI am from Rajasthan!");
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value of a:");  
        int a = sc.nextInt();

        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        
        System.out.println("The value of 'c' is:");
        int c = logic(a, b);

        System.out.println(c);
        abc();
        sc.close();

    }
}
