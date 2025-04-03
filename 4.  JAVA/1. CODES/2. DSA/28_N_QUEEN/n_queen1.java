public class n_queen1 {

    // Function to solve the N-Queens problem using backtracking
    public static void solveNQueens(char board[][], int currentRow) {
        // If all queens are placed, print the solution and return
        if (currentRow == board.length) {
            printBoard(board);
            solutionCount++;
            return;
        }
        
        // Try placing a queen in each column of the current row
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, currentRow, col)) {
                board[currentRow][col] = 'Q';  // Place queen
                solveNQueens(board, currentRow + 1);  // Move to next row
                board[currentRow][col] = 'X';  // Backtrack (remove queen)
            }
        }
    }

    // Function to check if placing a queen at (row, col) is safe
    public static boolean isSafe(char board[][], int row, int col) {
        // Check vertically upwards in the same column
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;  // Queen found in the same column
            }
        }

        // Check diagonally upwards to the left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;  // Queen found in the left diagonal
            }
        }

        // Check diagonally upwards to the right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;  // Queen found in the right diagonal
            }
        }

        // If no conflicts, the position is safe
        return true;
    }

    // Function to print the board
    public static void printBoard(char board[][]) {
        System.out.println("------- Chess Board -------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");  // Print each element
            }
            System.out.println();  // Move to the next line
        }
        System.out.println("---------------------------");
    }

    // Variable to count the number of solutions
    static int solutionCount = 0;

    public static void main(String[] args) {
        int n = 4;  // Size of the board (4x4)
        char board[][] = new char[n][n];

        // Initialize the board with 'X' to represent empty spaces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';  // 'X' means empty
            }
        }

        // Call the solveNQueens function starting from row 0
        solveNQueens(board, 0);

        // Print the total number of solutions found
        System.out.println("Total solutions: " + solutionCount);
    }
}
