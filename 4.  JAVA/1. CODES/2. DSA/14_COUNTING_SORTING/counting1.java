import java.util.*;
//


public class counting1 {
    public static void counting(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int [largest+1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]>0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {2, 9, 7, 4, 1, 8, 4};
        counting(arr);
        System.out.println(arr);
    }
}
