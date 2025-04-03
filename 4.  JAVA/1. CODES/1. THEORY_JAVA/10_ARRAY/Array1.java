 // package JAVA.T.10_Array;
import java.util.Scanner;
public class Array1 {
    public static void main(String[] args){
        /*
         * A 'ARRAY' is a collaction of Similar type of data
         */

        int [] marks = new int[5];
        
        /*
         * THER ARE THREE METHOD TO DECLARE A ARRAY
         * 1. int[] marks = new int[5]
         * 
         * 2. int [] marks;
         *     marks = new int[5];
         * 
         * 3. int [] marks = {-------------}; 
         */
        // Assigning array element
        marks[0] = 90;
        marks[1] = 80;
        marks[2] = 70;
        marks[3] = 60;
        marks[4] = 50;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks.length);
/*
 * PRINTING THE ELEMENTS BY FOR LOOP
 */
        for (int element : marks) {
            System.out.println(element);
        }

        for(int i=0; i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("---------------------------------------------------");

/*
 * HERE I AM GOING TO MAKE A 2D ARRAY WHERE THE VALUES TAKING BY USER
 */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = input.nextInt();

        int[][] array = new int[rows][columns];

        System.out.println("Enter the values of the array: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter value for [" + i + "][" + j + "]: ");
                array[i][j] = input.nextInt();
            }
        }

        System.out.println("The 2D array is: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
            input.close();
    }
}
}
