public class binary1 {
    public static int BinarySearchAlgo(int num[], int key){
        int start = 0, end = num.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            //! COMPARISION
            if(num[mid] == key){
                return mid;
            }
            // ? RIGHT
            if(num[mid] < key){
                start = mid+1;
            }
            // ? LEFT
            else{   
                end = mid-1;
            }
        }
        return -1; // KEY DOES'NT EXIST IN ARRAY
    }

    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14}; // sorted in increasing order
        int key = 10;

        System.out.println("Index for Key is: "+BinarySearchAlgo(num, key));
    }
}
