public class search_matrix1 {
    public static boolean search(int matrix[][]){
        int key = 10;
        int row = 0, column = matrix[0].length;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column]==key){
                System.out.println("Key found at: ( "+row+", "+column+" )");
                return true;
            }
            else if (key < matrix[row][column]) {
                column--;
            }
            else{
                row++;
            }
            
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        
        search(matrix);
    }
}
