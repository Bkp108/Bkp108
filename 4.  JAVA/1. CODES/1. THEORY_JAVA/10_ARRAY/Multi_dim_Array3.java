// package JAVA.THEORY_JAVA.10_ARRAY;

public class Multi_dim_Array3 {
    public static void main(String[] args){
        // Declare a MULTI-DIMENSION ARRAY

        int[][] b = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };


        int[][] a = new int[3][]; // 3 rows, but columns not specified
        a[0] = new int[]{1, 2, 3};
        a[1] = new int[]{4, 5};
        a[2] = new int[]{6, 7, 8, 9};

        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                int element = b[i][j];
                System.out.println(element);
            }
        }
        
    }
}
