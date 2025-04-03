import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        // Profit array
        int val[] = {10, 5, 15, 7, 6, 18, 3};
        // Weight array
        int weight[] = {2, 3, 5, 7, 1, 4, 1};
        // Knapsack capacity
        int W = 15;

        // Create a 2D array to store profit-to-weight ratio along with item index
        double ratio[][] = new double[val.length][2];
        // 0th col=> idx; 1st col => ratio

        // Calculate and store profit-to-weight ratio for each item
        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i; // Index of the item
            ratio[i][1] = (double) val[i] / weight[i]; // Profit-to-weight ratio
        }

        // Sort the items in ascending order based on profit-to-weight ratio
        Arrays.sort(ratio, Comparator.comparing(o -> o[1]));

        // Initialize capacity of knapsack and final value
        int capacity = W;
        int finalVal = 0;

        // Iterate through sorted items from highest to lowest ratio
        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0]; // Index of the item
            // Check if the entire item can be added to the knapsack
            if (capacity >= weight[idx]) {
                finalVal += val[idx]; // Add profit of the item to final value
                capacity -= weight[idx]; // Decrease knapsack capacity
            } else {
                // Include fractional value of the item
                finalVal += (ratio[i][1] * capacity);
                capacity = 0; // Knapsack is full
                break;
            }
        }
        // Print the final value obtained
        System.out.println("Final value: " + finalVal);
    }
}
