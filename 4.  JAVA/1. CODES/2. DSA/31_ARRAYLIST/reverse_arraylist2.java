import java.util.ArrayList;

public class reverse_arraylist2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        arr.add(7);
        arr.add(6);
        arr.add(5);
        arr.add(4);
        arr.add(3);

        System.out.println(arr);
        System.out.print("Reverse: ");
        for (int i = arr.size()-1; i >=0; i--) {
            System.out.print(arr.get(i)+" ");
        }
    }
}
