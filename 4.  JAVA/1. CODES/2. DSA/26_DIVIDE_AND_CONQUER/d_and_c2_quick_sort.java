/*
 ! QUICK SORT
 ? There are 2 terms :
 ? 1. pivot: take a random key from array, separate left part with less than key values, right side is grater than
 ? 2. partition: divide in parts 
 ? 3. do same quick sorting till end 
 */

public class d_and_c2_quick_sort {
    public static void printarray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println();
    }

    public static void quick1(int a[], int s, int e) {
        if (s >= e) {
            return;
        }
        int index = partition(a, s, e); // pivat
        quick1(a, s, index - 1); // left part
        quick1(a, index + 1, e); // right part
    }

    public static int partition(int a[], int s, int e) {
        int pivot = a[e];
        int i = s - 1;
        for (int j = s; j < e; j++) {
            if (a[j] <= pivot) {
                i++;
                int temp = a[j];
                a[j] = a[i];
                a[i] = temp;
            }
        }
        i++;
        int temp = pivot;
        a[e] = a[i];
        a[i] = temp;
        return i;

    }

    public static void main(String[] args) {
        int a[] = { 6, 3, 9, 8, 2, 5 };
        quick1(a, 0, a.length - 1);
        printarray(a);
    }
}
