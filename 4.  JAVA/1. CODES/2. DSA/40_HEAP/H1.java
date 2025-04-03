
//! Priority Queues
import java.util.Comparator;
import java.util.PriorityQueue;

public class H1 {
    public static void main(String[] args) {
        // ! Priority Queues
    //     PriorityQueue<Integer> h1 = new PriorityQueue<>();
    //     h1.add(5); // ? O(log n)
    //     h1.add(1);
    //     h1.add(3);
    //     h1.add(2);

    //     while (!h1.isEmpty()) {
    //     System.out.println(h1.peek()); // ? O(1)
    //     h1.remove(); // ? O(log n)
    //     }
    // }

        // ! priority in reverse order
        PriorityQueue<Integer> h2 = new PriorityQueue<>(Comparator.reverseOrder());
        h2.add(5); // ? O(log n)
        h2.add(1);
        h2.add(3);
        h2.add(2);

        while (!h2.isEmpty()) {
            System.out.println(h2.peek()); // ? O(1)
            h2.remove(); // ? O(log n)
        }
    }}
