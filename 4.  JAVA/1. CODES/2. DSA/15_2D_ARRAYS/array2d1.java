import java.util.*;

public class array2d1 {
    /*
     * SEARCH ELEMENT IN MATRIX
     */
    public static boolean searchelement(int matrix[][]){
        int key = 5;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (key==matrix[i][j]) {
                    System.out.println("fount at: ("+ i +", " +j+ ")");
                    return true;
                }
            }
        }
        System.out.println("key note found");
        return false;
    }



    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        Scanner sc = new Scanner(System.in);
        /*
         * INPUT ELEMENT
         */
        int r = matrix.length, c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("MATRIX IS: \n");
        /*
         * OUTPUT EVERY ROW
         */
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        searchelement(matrix);
        sc.close();

    }

    
    
}
