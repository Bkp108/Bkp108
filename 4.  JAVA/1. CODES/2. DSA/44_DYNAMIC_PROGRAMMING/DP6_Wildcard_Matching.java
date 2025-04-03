/*
 ! Wildcard Matching
 ? Given a text and a wildcard pattern, implement wildcard pattern mathching 
 ? algorithm that finds if wildcard pattern is matched with text.
 ? The matching should cover the entire text (not partial text). 
 ? The wildcard patter can include the character "?"(matches any single character) 
 ? and "*"(match any sequence of character(include the qmpty sequence))

 */
public class DP6_Wildcard_Matching {
    public static boolean ismatch(String s, String p){
        int n = s.length();
        int m = p.length();

        boolean dp[][] = new boolean[n+1][m+1];

        //initialze
        dp[0][0] = true;
        // pattern = " "
        for (int i = 0; i < n+1; i++) {
            dp[i][0] = false;
        }

        //s= " "
        for(int j =1; j< m+1; j++){
            if (p.charAt(j-1) == '*') {
                dp[0][j] = dp[0][j-1];
            }
        }

        // bottom up
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < m+1; j++) {
                if (s.charAt(i-1) == p.charAt(j-1) || p.charAt(j-1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                }
                else if(p.charAt(j-1) == '*'){
                    dp[i][j] = dp[i-1][j] || dp[i][j-1];
                }
                else{
                    dp[i][j] = false;
                }
            }
        }
        //string -> n. pattern -> m
        return dp[n][m];
    }
    public static void main(String[] args) {
        String s = "baaabab";
        String p = "*****ba******ab";
        System.out.println(ismatch(s, p));
    }
}
