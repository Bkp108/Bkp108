import java.util.*;
public class Q4_framework {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>(); 
        //! queue is a interface we cant create a object of queue so we use linked list arraydeque
        q.add(1);
        q.add(2);
        q.add(3);
        

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }



        Queue<Integer> q1 = new ArrayDeque<>(); 
        //! queue is a interface we cant create a object of queue so we use linked list arraydeque
        q1.add(1);
        q1.add(2);
        q1.add(3);
        

        while (!q1.isEmpty()) {
            System.out.println(q1.peek());
            q1.remove();
        }
    }
}
