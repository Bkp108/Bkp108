public class recursion3_print_no_increasing_order {
    public static void increasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        for(int i=0; i<n; i++){
            System.out.println(i);
        }

    }
    public static void main(String[] args) {
        int n = 7;
        increasing(n);
    }
}
