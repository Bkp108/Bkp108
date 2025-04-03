
public class linkedlist1 {
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

    public static class LinkedList {

        // ! ADD FIRST ELEMENT
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        // ! ADD LAST ELEMENT
        public void addLast(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // ! PRINT LINKED-LIST
        public void print() {
            if (head == null) {
                System.out.println("null");
                return;
            }
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " --> ");
                temp = temp.next;
            }
            System.out.println(" null");
        }

        // ! ADD MIDDLE
        public void addMiddle(int idx, int data) {
            if (idx == 0) {
                addFirst(data);
                return;
            }
            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            // int temp;
            while (i < idx - 1) {
                temp = temp.next;
                i++;
            }
            // ? i = idx-1; temp-> prev
            newNode.next = temp.next;
            temp.next = newNode;
        }

        // ! REMOVE FIRST
        public int removefirst() {
            if (size == 0) {
                System.out.println("LINKED-LIST is Empty!");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }

        // ! REMOVING LAST
        public int removelast() {
            if (size == 0) {
                System.out.println("LINKED-LIST is Empty!");
                return Integer.MIN_VALUE;
            } else if (size == 1) {
                int val = head.data;
                head = tail = null;
                size = 0;
                return val;
            }
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }

            int val = prev.next.data;
            prev.next = null;
            tail = prev;
            size--;
            return val;
        }

        // ! ITERATIVE SEARCHING
        public int searchiterative(int key) {
            Node temp = head;
            int i = 0;
            while (temp != null) {
                if (temp.data == key) {
                    return i;
                }
                temp = temp.next;
                i++;
            }

            return -1;

        }

        // ! RECURSIVE SEARCHING
        public int helper(Node head, int key) {
            if (head == null) {
                return -1;
            }
            if (head.data == key) {
                return 0;
            }
            int idx = helper(head.next, key);
            if (idx == -1) {
                return -1;
            }
            return idx + 1;
        }

        public int searchrecursive(int key) {
            return helper(head, key);
        }

        // ! REVERSE OUR LINKED-LIST
        public void reverse() {
            Node prev = null;
            Node curr = tail = head;
            Node next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            head = prev;
        }

        // ! Find and remove nth NODE end
        public void deletenthll(int n) {
            // ? calculate size
            int sz = 0;
            Node temp = head;
            while (temp != null) {
                temp = temp.next;
                sz++;
            }
            if (n == sz) {
                head = head.next;
                return;
            }

            // ? sz-n
            int i = 1;
            int itofind = sz - n;
            Node prev = head;
            while (i < itofind) {
                prev = prev.next;
                i++;
            }
            prev.next = prev.next.next;
            return;
        }

        // ! Check the linked list is palindrom
        public Node findMid(Node head) {

            Node slow = head;
            Node fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next; // * +1
                fast = fast.next.next; // * +2

            }
            return slow; // * slow is my middle node
        }

        public boolean checkpalindrom() {
            if (head == null || head.next != null) {
                return true;
            }
            // step1: find mid
            Node midnode = findMid(head);
            // step2: reverse half
            Node prev = null;
            Node curr = midnode;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;

            }
            Node right = prev; // * right half ka head
            Node left = head;

            // step3: check left half and right half
            while (right != null) {
                if (left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
        // ! DELET A LOOP-CYCLE IN A LINKED-LIST

        public static boolean havingCycle() {
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (slow == fast) {
                    return true;
                }
            }
            return false;
        }

        // ! REMOVE CYCLE IN A LINKED-LIST
        public static void removecycle() {
            // detect cycle
            Node slow = head;
            Node fast = head;
            boolean cycle = false;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
                if (fast == slow) {
                    cycle = true;
                    break;
                }
            }
            if (cycle = false) {
                return;
            }

            // find meeting point
            slow = head;
            Node prev = null; // last node
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }
            
            // remove cycle last.next = null
            prev.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(2);
        l1.addFirst(1);
        l1.addLast(2);
        l1.addLast(1);
        l1.print();
        l1.addMiddle(2, 9); // add 9 at index 2

        l1.print();
        l1.removefirst(); // remove 1
        l1.print();

        l1.removelast();
        l1.print();

        System.out.println(l1.size);
        System.out.println(l1.searchiterative(9));
        System.out.println(l1.searchiterative(10));

        System.out.println(l1.searchrecursive(9));
        System.out.println(l1.searchrecursive(10));

        l1.reverse();
        l1.print();

        l1.deletenthll(3);
        l1.print();

        System.out.println(l1.checkpalindrom());

        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(1);
        System.out.println(havingCycle());
    }
}
