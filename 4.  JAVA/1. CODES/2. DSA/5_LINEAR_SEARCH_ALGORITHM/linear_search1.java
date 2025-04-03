public class linear_search1 {
    public static int linear_search(int a[], int k) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == k) {
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {

        int a[] = { 2, 4, 6, 8, 10, 12};
        int k = 8;
        int index = linear_search(a, k);
        if (index == -1) {
            System.out.println("key is not in list!");
        } else {
            System.out.println("The element at: " + index);
        }

    }
}

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.print("Enter the number of rows: ");
// int n = sc.nextInt();
// int a[] = new int[n];

// System.out.println("Enter the element of list: ");
// for (int i = 0; i < a.length; i++) {
// a[i] = sc.nextInt();
// }

// System.out.print("The list is: ");
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " ");
// }
// System.out.println();

// System.out.print("Enter the number whose index you want: ");
// int k = sc.nextInt();

// int index = linear_search(a, k);
// if (index == -1) {
// System.out.println("The number is not in list!");
// }
// else{
// System.out.println("The element at: " + index);
// }

// sc.close();
// }
// }
