/*
 ! PRINT NUMBER FROM N TO 1 ( DECREASING ORDER )
 */


public class recursion2_print_no_decreasing_order {
    public static void reverse(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        reverse(n-1);
    }
    public static void main(String[] args) {
        int n = 7;
        reverse(n);
    }
}
