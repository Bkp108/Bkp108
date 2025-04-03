//! Longest Common Subsequence

import java.util.Arrays;

public class DP4_LCS {

    //! Recursive approach for Longest Common Subsequence (LCS)
    public static int lcs(String str1, String str2, int n, int m) {
        // Base case: If either of the strings is empty, then the longest common subsequence length is 0
        if (n == 0 || m == 0) {
            return 0;
        }

        // If the characters at current positions are same
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            // Include the current characters and recursively find LCS for the remaining strings
            return 1 + lcs(str1, str2, n - 1, m - 1);
        } else {
            // If the characters are different, we have two options:
            // 1. Exclude the last character of str1 and find LCS for remaining strings
            int ans1 = lcs(str1, str2, n - 1, m);
            // 2. Exclude the last character of str2 and find LCS for remaining strings
            int ans2 = lcs(str1, str2, n, m - 1);
            // Return the maximum of both options
            return Math.max(ans1, ans2);
        }
    }

    //! Dynamic Programming with Memoization for Longest Common Subsequence (LCS)
    public static int lcs2(String str1, String str2, int n, int m, int[][] memo) {
        // Base case: If either of the strings is empty, then the longest common subsequence length is 0
        if (n == 0 || m == 0) {
            return 0;
        }
        
        // If the value is already memoized, return it
        if (memo[n][m] != -1) {
            return memo[n][m];
        }
        
        // If the characters at current positions are same
        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            // Include the current characters and recursively find LCS for the remaining strings
            return memo[n][m] = 1 + lcs2(str1, str2, n - 1, m - 1, memo);
        } else {
            // If the characters are different, we have two options:
            // 1. Exclude the last character of str1 and find LCS for remaining strings
            int ans1 = lcs2(str1, str2, n - 1, m, memo);
            // 2. Exclude the last character of str2 and find LCS for remaining strings
            int ans2 = lcs2(str1, str2, n, m - 1, memo);
            // Return the maximum of both options
            return memo[n][m] = Math.max(ans1, ans2);
        }
    }
    
    
    
    //! Dynamic Programming with Tabulation for Longest Common Subsequence (LCS)
    public static int lcsTab(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();
    
        int dp[][] = new int[n + 1][m + 1];
    
        // Initialize the dp array
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < m + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }
    
        // Tabulation loop to fill the dp array
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < m + 1; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
    
        return dp[n][m]; // Return the length of the LCS
    }

    

    public static void main(String args[]) {
        String str1 = "abcdge"; 
        String str2 = "abedg";
        // Call the recursive LCS function with the lengths of the input strings as arguments
        //! Recursion
        System.out.println(lcs(str1, str2, str1.length(), str2.length()));

        // Call the memoized LCS function with the lengths of the input strings as arguments
        int[][] memo = new int[str1.length() + 1][str2.length() + 1];
        for (int i = 0; i < memo.length; i++) {
            Arrays.fill(memo[i], -1);
        }
        //! DP Memozition
        System.out.println(lcs2(str1, str2, str1.length(), str2.length(), memo));
        //! DP Tabulation
        System.out.println(lcsTab(str1, str2));
    }
}
