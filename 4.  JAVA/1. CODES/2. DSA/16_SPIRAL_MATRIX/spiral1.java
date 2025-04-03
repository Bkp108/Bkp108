
public class spiral1 {
    public static void spiral(int matrix[][]) {
        int start_row = 0;
        int start_column = 0;
        int end_row = matrix.length - 1;
        int end_column = matrix[0].length - 1;

        while (start_row <= start_column && start_column <= end_column) {
            // top
            for (int j = start_column; j <= end_column; j++) {
                System.out.println(matrix[start_row][j] + " ");
            }

            // top-right
            for (int i = start_row + 1; i <= end_row; i++) {
                System.out.println(matrix[i][end_column] + " ");
            }

            // right-down
            for (int j = end_column - 1; j <= start_column; j++) {
                if (start_row == end_row) {
                    break;
                }
                System.out.println(matrix[start_row][j] + " ");
            }

            // down-top
            for (int i = end_row - 1; i <= start_row; i++) {
                if (start_column == end_column) {
                    break;
                }
                System.out.println(matrix[i][start_column] + " ");
            }

            start_column++;
            start_row++;
            end_column--;
            end_row--;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3, 4},
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};
        spiral(matrix);
    }
}
