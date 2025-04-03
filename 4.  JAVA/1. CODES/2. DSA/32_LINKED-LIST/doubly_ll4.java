public class doubly_ll4 {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }


        public Node head;
        public Node tail;
        public int size;

        // ADD
        public void addFirst(int data) {
            Node newNode = new Node(data);
            size++;
            if (head == null) {
                head = tail = newNode;
                return;
            }

            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }

        // Print
        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + "<->");
                temp = temp.next;
            }
            System.out.print("null");
        }

        // REMOVE FIRST
        public void removeFirst() {
            if (head == null) {
                return; // Empty list
            }

            size--;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
        }
   

    public static void main(String[] args) {
        doubly_ll4 dll = new doubly_ll4();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        System.out.println("\nSize: " + dll.size);
        
        dll.removeFirst(); // Removing the first node
        dll.print();
        System.out.println("\nSize after removal: " + dll.size);
    }
}


