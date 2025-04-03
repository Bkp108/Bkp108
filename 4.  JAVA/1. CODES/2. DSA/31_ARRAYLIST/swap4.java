import java.util.ArrayList;

public class swap4 {
    public static void swap(ArrayList<Integer> arr, int indx1, int indx2){
        int temp = arr.get(indx1);
        arr.set(indx1, arr.get(indx2));
        arr.set(indx2, temp);
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(9);
        arr.add(2);
        arr.add(6);
        arr.add(7);
        System.out.println(arr);
        int indx1 = 1, indx2= 3;
        swap(arr, indx1, indx2);
        System.out.println(arr);
    }
}
