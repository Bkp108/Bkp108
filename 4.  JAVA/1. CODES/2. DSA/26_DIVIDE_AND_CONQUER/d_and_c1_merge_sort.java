/*
 ! DIVIDE AND CONQUER:
 ? DIVIDE OUR PROBLEM IN SMALL PARTS AND SOLVE SMALL PART AND ADD ALL PARTS SOLUTION
 */

public class d_and_c1_merge_sort {
    public static void merge(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static void merge_sort(int arr[], int s, int e){
        if(s>=e){
            return;
        }
        int mid = (s+e)/2;
        merge_sort(arr, s, mid); // right part
        merge_sort(arr, mid+1, e); // left part
        merge1(arr, s, e, mid);
    }

    public static void merge1(int arr[], int s, int e, int mid){
        int temp[] = new int[e-s+1];
        int i = s; // iterator for left
        int j = mid+1; // iterator for right
        int k = 0; // iterator for temp

        while (i<=mid && j<= e) {
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else{
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
// ? LEFT PART
        while (i<=mid) {
            temp[k++] = arr[i++];
        }
// ? RIGHT PART
        while (j<=e) {
            temp[k++] = arr[j++];
        }
// ? COPY TEMP TO ORIGINAL
        for (k = 0, i = s; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }
    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 2, 5, 1};
        merge_sort(arr, 0, arr.length-1);
        merge(arr);
    }
}
