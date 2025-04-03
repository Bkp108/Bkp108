/*
 ! type of 0-1 Knapsack Problem
 ? Fractional Knapsack(Greedy)
 ? 0-1 Knapsack 
 ? Unbounded Knapsack
 */

import java.util.Arrays;

public class DP3_Knapsack {

    // ! 0-1 KNAPSACK
    // ! RECURSION
    public static int knapsackrecu(int[] val, int[] wt, int W, int n) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (wt[n - 1] <= W) { // valid
            // include
            int include = val[n - 1] + knapsackrecu(val, wt, W - wt[n - 1], n - 1);
            // exclude
            int exclude = knapsackrecu(val, wt, W, n - 1);
            return Math.max(include, exclude);
        } else { // not valid
            return knapsackrecu(val, wt, W, n - 1);
        }
    }

    // ! DP(Memoization)
    public static int knapsackmemo(int val[], int wt[], int W, int n, int dp[][]) {
        // Base case: if either the value or weight or capacity is zero or negative
        if (n == 0 || W == 0) {
            return 0;
        }

        // If the value is already calculated, return it from the memoization table
        if (dp[n][W] != -1) {
            return dp[n][W];
        }

        // If the weight of the current item exceeds the capacity, skip it
        if (wt[n - 1] > W) {
            dp[n][W] = knapsackmemo(val, wt, W, n - 1, dp); // Exclude the item
            return dp[n][W];
        } else {
            // Calculate the maximum value by including and excluding the current item
            int include = val[n - 1] + knapsackmemo(val, wt, W - wt[n - 1], n - 1, dp); // Include the item
            int exclude = knapsackmemo(val, wt, W, n - 1, dp); // Exclude the item
            dp[n][W] = Math.max(include, exclude); // Store the result in the memoization table
            return dp[n][W];
        }
    }

    // ! DP(Tabulation)
    public static int knapsacktabu(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0; // Initialize the 0th column with 0
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0; // Initialize the 0th row with 0
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                int v = val[i - 1]; // ith item value
                int w = wt[i - 1]; // ith item weight

                if (w <= j) { // If the weight of the current item is less than or equal to the current
                              // capacity
                    int incProfit = v + dp[i - 1][j - w]; // Include the current item
                    int excProfit = dp[i - 1][j]; // Exclude the current item
                    dp[i][j] = Math.max(incProfit, excProfit); // Choose the maximum of including and excluding the item
                } else { // If the weight of the current item exceeds the current capacity
                    dp[i][j] = dp[i - 1][j]; // Exclude the current item
                }
            }
        }

        return dp[n][W]; // Return the maximum profit achievable with the given capacity
    }

    // ! UNBOUNDED KNAPSACK
    public static int unbounded(int val[], int wt[], int W) {
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // Initializing the base cases
        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 0; // Initialize the 0th column with 0
        }

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = 0; // Initialize the 0th row with 0
        }

        // Dynamic programming loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= W; j++) {
                int v = val[i - 1]; // ith item value
                int w = wt[i - 1]; // ith item weight

                // If the weight of the current item is less than or equal to the current
                // capacity
                if (wt[i - 1] <= j) {
                    // Calculate the maximum value by either including or excluding the current item
                    dp[i][j] = Math.max(val[i - 1] + dp[i][j - w], dp[i - 1][j]);
                } else { // If the weight of the current item exceeds the current capacity
                    dp[i][j] = dp[i - 1][j]; // Exclude the current item
                }
            }
        }

        return dp[n][W]; // Return the maximum profit achievable with the given capacity
    }

    // ! Coin Change
    public static int coinChange(int coins[], int sum) {
        int n = coins.length;
        int dp[][] = new int[n + 1][sum + 1];

        // Initializing dp array
        for (int i = 0; i < n + 1; i++) {
            dp[i][0] = 1; // Base case: If sum is 0, there is only one way to make it (by not selecting
                          // any coin)
        }

        for (int j = 1; j < sum + 1; j++) {
            dp[0][j] = 0; // Base case: If coins array is empty, there is no way to make any sum
        }

        // Dynamic programming loop
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                if (coins[i - 1] <= j) { // If the current coin value is less than or equal to the current sum
                    dp[i][j] = dp[i][j - coins[i - 1]] + dp[i - 1][j];
                } else { // If the current coin value is greater than the current sum
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[n][sum];
    }

    // ! Rod Cutting
    public static int rodCutting(int length[], int price[], int totRod) {
        int n = price.length;
        int dp[][] = new int[n + 1][totRod + 1];

        // Initializing dp array
        for (int i = 0; i < n + 1; i++) {
            for (int j = 0; j < totRod + 1; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                }
            }
        }

        // Dynamic programming loop
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < totRod + 1; j++) {
                if (length[i - 1] <= j) { // If the length of the current piece is less than or equal to the current rod
                                          // length
                    dp[i][j] = Math.max(price[i - 1] + dp[i][j - length[i - 1]], dp[i - 1][j]);
                } else {
                    dp[i][j] = dp[i - 1][j]; // If the length of the current piece exceeds the current rod length
                }
            }
        }

        return dp[n][totRod]; // Return the maximum profit achievable with the given total rod length
    }

    public static void main(String args[]) {
        // ! 0-1 KNAPSACK
        int val[] = { 15, 14, 10, 45, 30 };
        int wt[] = { 2, 5, 1, 3, 4 };
        int W = 7;
        int dp[][] = new int[val.length + 1][W + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }

        System.out.println(knapsackrecu(val, wt, W, val.length));
        System.out.println(knapsackmemo(val, wt, W, val.length, dp));
        System.out.println(knapsacktabu(val, wt, W));

        // ! UNBOUNDED KNAPSACK
        System.out.println(unbounded(val, wt, W));

        // ! Coin Change

        int coins[] = { 2, 5, 3, 6 };
        int sum = 10; // target sum
        System.out.println(coinChange(coins, sum)); // Output: 4

        // ! Rod Cuttig
        int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 }; // Length of pieces
        int price[] = { 1, 5, 8, 9, 10, 17, 17, 20 }; // Price of pieces
        int totRod = 8; // Total length of the rod
        System.out.println(rodCutting(length, price, totRod)); // Output: 22

    }

}
