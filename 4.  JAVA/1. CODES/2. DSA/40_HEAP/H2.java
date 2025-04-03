
/*
 ! heap is complete binary tree
 ? Complete Binary Tree is a BT in which all levels are completely filled except
 ? possibily the last one, which is filled from the left to right.
 * childre >= parents(maxheap)
 * children <= parents(minheap)
 * 
 * 
 * 
 !      MAX HEAP                              MIN HEAP
 *         10                                      1
 *        /  \                                   /  \
 *       4    5                                 2    4
 *      / \                                    / \
 *     1   2                                  5  10
 * 
 ! Heap is not impemented as a class
 ? Heap as an array | arraylist
 * left child = 2i+1
 * right child = 2i+2
 */

 import java.util.*;

 public class H2 {
    //! MIN HEAP*****************************************************************
     static class Heap {
         ArrayList<Integer> arr = new ArrayList<>();
 
         //! INSERT IN HEAP
         public void add(int data) { //* O(logn) */
             //?add at last index
             arr.add(data);
 
             int x = arr.size() - 1; //* x is child index
             int par = (x - 1) / 2; //* parent index
 
             while (x > 0 && arr.get(x) < arr.get(par)) {
                 //*swap */
                 int temp = arr.get(x);
                 arr.set(x, arr.get(par));
                 arr.set(par, temp);
 
                 x = par;
                 par = (x - 1) / 2;
             }
         }
 
         //! PEEK IN A HEAP
         public int peek() {
             return arr.get(0);
         }
 
         //! REMOVE FROM HEAP
         private void heapify(int i) {
             int left = 2 * i + 1;
             int right = 2 * i + 2;
             int minidx = i;
 
             if (left < arr.size() && arr.get(minidx) > arr.get(left)) {
                 minidx = left;
             }
             if (right < arr.size() && arr.get(minidx) > arr.get(right)) {
                 minidx = right;
             }
 
             if (minidx != i) {
                 //swap
                 int temp = arr.get(i);
                 arr.set(i, arr.get(minidx));
                 arr.set(minidx, temp);
 
                 heapify(minidx);
             }
         }
 
         public int remove() {
             int data = arr.get(0);
 
             //* swap first and last */
             int temp = arr.get(0);
             arr.set(0, arr.get(arr.size() - 1));
             arr.set(arr.size() - 1, temp);
 
             //* delete last */
             arr.remove(arr.size() - 1);
 
             //* heapify */
             heapify(0);
             return data;
         }
 
         public boolean isEmpty() {
             return arr.size() == 0;
         }
     }


     //! MAX HEAP*****************************************************************
     static class Heap1 {
        ArrayList<Integer> arr = new ArrayList<>();

        //! INSERT IN HEAP
        public void add(int data) { //* O(logn) */
            //?add at last index
            arr.add(data);

            int x = arr.size() - 1; //* x is child index
            int par = (x - 1) / 2; //* parent index

            while (x > 0 && arr.get(x) > arr.get(par)) {
                //*swap */
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        //! PEEK IN A HEAP
        public int peek() {
            return arr.get(0);
        }

        //! REMOVE FROM HEAP
        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int maxidx = i;

            if (left < arr.size() && arr.get(maxidx) < arr.get(left)) {
                maxidx = left;
            }
            if (right < arr.size() && arr.get(maxidx) < arr.get(right)) {
                maxidx = right;
            }

            if (maxidx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(maxidx));
                arr.set(maxidx, temp);

                heapify(maxidx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //* swap first and last */
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);

            //* delete last */
            arr.remove(arr.size() - 1);

            //* heapify */
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }
 
     public static void main(String[] args) {
         //! MIN HEAP
         System.out.println("MIN HEAP-->");
         Heap h = new Heap(); 
         h.add(3);
         h.add(4);
         h.add(1);
         h.add(5);
 
         while (!h.isEmpty()) {
             System.out.println(h.peek());
             h.remove();
         }

         //! MAX HEAP
         System.out.println("MAX HEAP-->");
         Heap1 h1 = new Heap1(); 
         h1.add(3);
         h1.add(4);
         h1.add(1);
         h1.add(5);
 
         while (!h1.isEmpty()) {
             System.out.println(h1.peek());
             h1.remove();
         }
     }
 }
 