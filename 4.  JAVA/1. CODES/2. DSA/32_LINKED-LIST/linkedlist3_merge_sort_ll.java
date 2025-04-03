import java.util.LinkedList;
public class linkedlist3_merge_sort_ll {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static class LinkedList1 {
        private Node merge(Node head1, Node head2) {
            Node mergell = new Node(-1);
            Node temp = mergell;

            while (head1 != null && head2 != null) {
                if (head1.data <= head2.data) {
                    temp.next = head1;
                    head1 = head.next;
                    temp = temp.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                    temp = temp.next;
                }

            }
            while (head1 != null) {
                temp.next = head1;
                head1 = head.next;
                temp = temp.next;
            }

            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
            return mergell.next;

        }

        private Node getMid(Node head){
            Node slow = head;
            Node fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        public Node mergesort(Node head) {
            if (head == null || head.next != null) {
                return head;
            }
            // find mid
            Node mid = getMid(head);
            // left & right
            Node rightHead = mid.next;
            mid.next = null;
            Node newleft = mergesort(head);
            Node newright = mergesort(rightHead);
            // merge
            return merge(newleft, newright);
        }
    }

    public static void main(String[] args) {
        LinkedList1 l1 = new LinkedList();
        l1.addFirst(1);
        l1.addFirst(2);
        l1.addFirst(3);
        l1.addFirst(4);
        l1.addFirst(5);


        System.out.println(l1);
        l1.head = mergesort(l1.head);

    }
}
