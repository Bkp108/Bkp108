import java.util.Scanner;

public class array1 {
    
    // Method to increment each element of the array by 1 and print the updated array
    public static void change(int a[]) {
        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] + 1;
        }
        print(a); // Call the print method to display the updated array
    }

    // Method to print the elements of the array
    public static void print(int a[]) {
        System.out.print("Array: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Method to insert an element at a specific index in the array
    public static int[] insert(int a[], int element, int index) {
        int[] newArray = new int[a.length + 1];
        for (int i = 0, j = 0; i < newArray.length; i++) {
            if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = a[j++];
            }
        }
        return newArray;
    }

    // Method to delete an element at a specific index in the array
    public static int[] delete(int a[], int index) {
        int[] newArray = new int[a.length - 1];
        for (int i = 0, j = 0; i < a.length; i++) {
            if (i != index) {
                newArray[j++] = a[i];
            }
        }
        return newArray;
    }

    // Method to search for an element in the array
    public static int search(int a[], int element) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == element) {
                return i;
            }
        }
        return -1; // Return -1 if element is not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array Creation
        System.out.println("--ARRAY CREATION--");
        System.out.print("ENTER THE NUMBER OF ELEMENTS IN ARRAY: ");
        int n = sc.nextInt();
        int a[] = new int[n];

        // Input Array Element
        System.out.println("--INPUT THE ELEMENTS TO THE ARRAY--");
        for (int i = 0; i < a.length; i++) {
            System.out.print("Enter element at index " + i + ": ");
            a[i] = sc.nextInt();
        }

        // Output array element (Traversal)
        System.out.println("--PRINT THE ARRAY--");
        print(a);

        // Array Length
        System.out.println("--LENGTH OF ARRAY--");
        System.out.println("The length of Array is: " + a.length);

        // Update Element
        System.out.println("--UPDATE ELEMENTS--");
        change(a);

        // Insert Element
        System.out.println("--INSERT ELEMENT--");
        System.out.print("Enter element to insert: ");
        int elementToInsert = sc.nextInt();
        System.out.print("Enter index where to insert: ");
        int insertIndex = sc.nextInt();
        a = insert(a, elementToInsert, insertIndex);
        print(a);

        // Delete Element
        System.out.println("--DELETE ELEMENT--");
        System.out.print("Enter index of element to delete: ");
        int deleteIndex = sc.nextInt();
        a = delete(a, deleteIndex);
        print(a);

        // Search Element
        System.out.println("--SEARCH ELEMENT--");
        System.out.print("Enter element to search: ");
        int elementToSearch = sc.nextInt();
        int searchIndex = search(a, elementToSearch);
        if (searchIndex != -1) {
            System.out.println("Element found at index: " + searchIndex);
        } else {
            System.out.println("Element not found in the array.");
        }

        // Close the scanner
        sc.close();
    }
}