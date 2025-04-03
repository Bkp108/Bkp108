public class reverse1 {
    public static void ReverseNumber(int num[]){
        int first = 0, last = num.length-1;
        while (first<last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;

            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5, 6, 7, 8};


        System.out.print("original array is: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println("");

        ReverseNumber(num);

        System.out.print("reverse array is: ");
        for(int i = 0; i < num.length; i++){
            System.out.print(num[i]);
            if (i < num.length - 1)
                System.out.print(", ");
        }
        System.out.println(" ");
    }
}

