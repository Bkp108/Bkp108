import java.util.ArrayList;
import java.util.Collections;

public class sort5 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(2);
        arr.add(6);
        arr.add(7);
        System.out.println("Original: "+arr);
        Collections.sort(arr); //! ascending
        System.out.println("Ascending Order: "+arr);

        Collections.sort(arr, Collections.reverseOrder());
        System.out.println("Decending Order: "+arr);
    }
}
