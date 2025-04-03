import java.util.Scanner;

public class WhileLoop {
    public static void main(String [] agrs){
        int i = 0;
        while(i < 10){
            System.out.println(i);
            i++;
        }
        System.out.println("The While loop is finished");
        System.out.println("------------------------------------------------");
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number:");
        int  num = sc.nextInt();
        System.out.println("----------------------------------");
        do{
            System.out.println(num);
            num++;
        }while(num<10);
        sc.close();
    }
}
