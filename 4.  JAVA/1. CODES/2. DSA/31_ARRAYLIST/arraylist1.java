import java.util.*;
public class arraylist1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<String> arr1 = new ArrayList<>();
        ArrayList<Float> arr2 = new ArrayList<>();
        ArrayList<Boolean> arr3  = new ArrayList<>();

        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr1.add("brijesh");
        arr2.add(5f);
        arr3.add(true);

        System.out.println(arr);
        System.out.println(arr1);
        System.out.println(arr2);
        System.out.println(arr3);


        int e = arr.get(4);
        System.out.println(e);

        arr.remove(2);
        System.out.println(arr);

        arr.set(2, 100);
        System.out.println(arr);

        System.out.println(arr.contains(100));

        arr.add(0, 8816);
        System.out.println(arr);

        System.out.println(arr.size());

        System.out.println("-------------------");
        for (int i = 0; i < arr.size(); i++){
            System.out.println(arr.get(i));
        }
        System.out.println("-------------------");        
    }
}
