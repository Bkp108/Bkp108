//! find Permutation of a String
//? "abc" --> abc, acb, bac, bca, cab, cba

public class backtracking3 {
    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            String st = str.substring(0, i) + str.substring(i + 1);
            findPermutation(st, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = new String("abc");
        findPermutation(str, "");;
    }
}
