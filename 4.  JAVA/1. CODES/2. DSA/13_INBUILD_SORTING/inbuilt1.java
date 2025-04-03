import java.util.*;


public class inbuilt1 {
    public static void main(String[] args) {
        Integer arr[] = {5, 2, 4, 3, 1};

// sorting by inbuild function take O(nlogn)
        Arrays.sort(arr);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println();

// in reverse order
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}
