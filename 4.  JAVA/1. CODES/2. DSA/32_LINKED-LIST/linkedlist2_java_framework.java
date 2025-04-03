import java.util.LinkedList;
public class linkedlist2_java_framework {
    public static void main(String[] args) {
        //? Create s linkedlist
        LinkedList<Integer> l1 = new LinkedList<>();

        //? add
        l1.addLast(1);
        l1.addLast(2);
        l1.addFirst(0);
//? print
        System.out.println(l1);

        //? remove
        l1.removeLast();
        l1.removeFirst();

        System.out.println(l1);
    }
}
