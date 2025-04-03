import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args){
        /*
         * SWITCH case is used when we have to make a choice
         * between number of alternative for a given variable
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Your age between 1 to 5: ");
        int age = s.nextInt();
        switch(age){
            case 1:
            System.out.println("you are 1 year old");
            break;

            case 2:
            System.out.println("you are 2 year old");
            break;

            case 3:
            System.out.println("you are 3 year old");
            break;

            case 4:
            System.out.println("you are 4 year old");
            break;

            case 5:
            System.out.println("you are 5 year old");
            break;

            default:
            System.out.println("YOU ARE ABOVE 5");
            break;
        }
        s.close();

    }
}
