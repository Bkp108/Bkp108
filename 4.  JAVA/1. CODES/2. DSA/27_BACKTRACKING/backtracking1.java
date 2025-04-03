// ! BACKTRACKING IN ARRAY
//? normal array is going 1,2,3,4,5
//? when he backtrack revery time reduce 2 then print --> -1, 0, 1, 2, 3

public class backtracking1{
    public static void changeArr(int arr[],  int i, int val){
        // base case
        if (i==arr.length) {
            printArr(arr);
            return;
        }

        // recursion
        arr[i] = val; //? first i=0, value = 1
        changeArr(arr, i+1, val+1); //? then he do 1+ in i=0 to i=1...4, and value =1....5 
        //? and recall/recursively call himself for increment
        arr[i] = arr[i]-2; //? after complete stack is full he backtrack with -2

    }

    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArr(arr);
    }
}