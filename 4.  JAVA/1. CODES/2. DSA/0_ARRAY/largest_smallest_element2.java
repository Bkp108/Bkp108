// import java.util.*;
public class largest_smallest_element2 {
    public static int largest(int a[]){
        int lrg = Integer.MIN_VALUE;
        for(int i = 0; i<a.length; i++){
            if(lrg < a[i]){
                lrg = a[i];
            }
        }
        return lrg;
    }

    
    public static int sml(int a[]){
        int sml = Integer.MAX_VALUE;
        for(int i = 0; i<a.length; i++){
            if(sml > a[i]){
                sml = a[i];
            }
        }
        return sml;
    }


    public static void main(String[] args) {
        int a[] = {1, 2, 6, 3, 5};
        int x = largest(a);
        System.out.println("Largest element of Array is: " +x);
        int y = sml(a);
        System.out.println("Smallest Element of Array is: " +y);
    }
}
