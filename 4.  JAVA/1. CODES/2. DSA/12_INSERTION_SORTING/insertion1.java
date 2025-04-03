// pick element from unsorted part and place in a reght position in sorted part

public class insertion1 {
    public static void insertion(int num[]){
        for(int i = 0; i < num.length; i++){
            int curr = num[i];
            int pre = i-1;
            while (pre >=0 && num[pre] > curr) {
                num[pre+1] = num[pre];
                pre--;
            }
            num[pre+1] = curr;
        }
    }
    public static void main(String[] args) {
        int num[] = {12, 31, 25, 8, 32, 17};
        insertion(num);
        System.out.println();
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println();
    }
}
