import java.util.*;

public class DP2_Climbing_Stairs {
    // ! recursive
    public static int countWaysrecu(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        return countWaysrecu(n - 1) + countWaysrecu(n - 2);
    }

    // ! DP(Memoization)

    public static int countWaysdpmemo(int n, int ways[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (ways[n] != -1) { // already calculated
            return ways[n];
        }
        ways[n] = countWaysdpmemo(n - 1, ways) + countWaysdpmemo(n - 2, ways);
        return ways[n];
    }

    // ! DP(Tablution)

    public static int countWaysdptabu(int n) {
        int dp[] = new int[n + 1];
        dp[0] = 1;

        // Tabulation loop
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1] + 0; // If i is 1, there's only one way to climb the stairs
            } else {
                dp[i] = dp[i - 1] + dp[i - 2]; // Otherwise, we sum up the previous two values in the dp array
            }
        }

        return dp[n];
    }

    public static void main(String args[]) {
        int n = 5; // Example input value
        int ways[] = new int[n + 1];
        Arrays.fill(ways, -1);
        System.out.println(countWaysrecu(n));
        System.out.println(countWaysdpmemo(n, ways));
        System.out.println(countWaysdptabu(n));
    }
}
