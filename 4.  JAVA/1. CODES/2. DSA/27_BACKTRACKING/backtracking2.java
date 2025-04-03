//! Find subset of a String using Backtracking
//? "abc" --> a, b, c, ab, bc, ca, abc

public class backtracking2{
    public  static void findSubSet(String str, String ans, int i){
        // bace case
        if (i == str.length()) {
            if(ans.length()==0){
                System.out.println("null ");
            }
            else{
                System.out.println(ans);
            }
                       
            return;
        }
        
        // recursion
        // yes choice
        findSubSet(str, ans+str.charAt(i), i+1);
        // no choise
        findSubSet(str, ans, i+1);
    }
    public static void main(String[] args){
        String str = "abc";
        findSubSet(str, "", 0);
    }
}