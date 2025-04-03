// Large element come to end of the array by swapping with adjacent of element

public class bubble1 {
    public static void bubble(int num[]){
        for(int i = 0; i < num.length-1; i++){
            for(int j = 0; j < num.length-1-i; j++){
                if(num[j] > num[j+1]){
                    int temp = num[j];
                    num[j] = num[j+1];
                    num[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int num[] = {5, 4, 1, 2, 3};


        System.out.print("Original Array is: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println();


        bubble(num);
        
        
        System.out.print("array after BUBBLE Sorting: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}
