// pick smallest one from unsorted array, put it at beginning
// updated version of bubble sort
// it pick smallest and pust at end 
// bubble swop near element it take a lot of swops but selection direct pust at there position

 
public class selection1 {
    public static void selection(int num[]) {
        for (int i = 0; i < num.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < num.length; j++) { // Fix: Increment j instead of i
                if (num[minPos] > num[j]) {
                    minPos = j;
                }
            }
            int temp = num[minPos];
            num[minPos] = num[i];
            num[i] = temp;
        }
    }

    public static void main(String[] args) {
        int num[] = {12, 29, 25, 8, 32, 17, 40};


        System.out.print("Original Array is: ");
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println();


        selection(num);

        
        System.out.print("array after SELECTION Sorting: "); // Fix: Corrected the print statement
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println(); // Fix: Removed unnecessary print of num
    }
}
