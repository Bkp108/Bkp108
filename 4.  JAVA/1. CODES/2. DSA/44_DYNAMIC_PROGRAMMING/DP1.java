 /*
 ! DYNAMIC PROGRAMMING:
 ? EXAMPLE FIBONACCI:
 ? 1. by recursion:
 * in recursion we calculate fib of a number every time when it come which increase the time
 ? 2. by dynamic:
 * in dynamic we calculate fib of number and then store in an array so we do not need to calculate again we just tak from array
 

 ? DP is optimized recursion
 ? how to identify dp:
 * 1. optimal problem: least, most, min, max, largest, smallest
 * 2. some choice is given(multiple branches in recursion tree)
 * 
 * 
 ! dynamic programming is a technique in computer programming that helps to
 ! efficiently solve a class of problems that have overlapping subproblems and
 ! optimal substructure property.



 ? Ways of dp
 * 1. Memoization(top down): 1st recursion, 2nd store sub problem reuse
 * 2. Tabulation(bottom up): iteration (store data in table/set) 
 * 
 * 
 ! 7 Important concept:
 ? Fibonacci
 ? 0-1 Knapsack
 ? Unbounded Knapsack
 ? LCS(Longest Common Subsequence)
 ? Kadanes Algorithm
 ? Catalan Number
 ? DP on Grid 
 */

public class DP1 {
    //! recursion
    //? in recursion tree we calculate fib of a number in every branch
    //? so in dp we store the repeating number in an array, and when it need we take it from array
    public static int fibrecursive(int n){
        if (n == 0 || n == 1) {
            return 0;
        }
        return fibrecursive(n - 1) + fibrecursive(n - 2);
    }

    //! dynamic 
    public static int fibdynamic(int n, int f[]){
        if (n == 0 || n == 1) {
            return n;
        }
        if(f[n] != 0){
            return f[n];
        }
        return fibdynamic(n - 1, f) + fibdynamic(n - 2, f);
    }
    public static void main(String[] args) {
        int n=5;
        int f[] = new int[n+1]; // initially array have all element 0, 0, 0, 0, 0 then it fill with value
        System.out.println(fibdynamic(n, f));
    }
}
