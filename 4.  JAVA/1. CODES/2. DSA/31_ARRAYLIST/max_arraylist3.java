import java.util.ArrayList;

public class max_arraylist3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(2);
        arr.add(6);
        arr.add(7);

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.size(); i++) {
            // if (max<arr.get(i)) {
            //     max = arr.get(i);
            // }

            max = Math.max(max, arr.get(i));

        }
        System.out.println("Max element is: "+max);
        

        
    }
}
