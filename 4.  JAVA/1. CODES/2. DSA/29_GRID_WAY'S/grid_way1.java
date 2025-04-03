public class grid_way1 {
    public static int grid(int i, int j, int n, int m){
        if (i == n-1 && j == m-1) { // condition for last call
            return 1;
        }
        else if (i == n || j == m-1) { // boundary cross ncondition
            return 0;
        }

        int w1 = grid(i+1, j, n, m);
        int w2 = grid(i, j+1, n, m);
        return w1+w2;
    }
    public static void main(String[] args) {
        int n=2, m=2;
        System.out.println(grid(0, 0, n, m));
    }
}