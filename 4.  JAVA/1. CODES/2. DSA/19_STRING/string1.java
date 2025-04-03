import java.util.*;
public class string1 {
    /*
     * GENERAL STRING CREATION , PRINTING, STRING INPUT
     */
    public static void str1() {
        char arr[] = { 'a', 'b', 'c', 'd', 'e', 'f' };
        String st = "abcd";
        String ab = new String("abcdef");
        System.out.println(arr);
        System.out.println(st);
        System.out.println(ab);

        // String is immuatble
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); // (word input)take only string if a white space come the string end
        System.out.println(s);

        String a = sc.nextLine(); // (complete line) take complete string with white space
        System.out.println(a);
        sc.close();
    }

    /*
     * STRING LENGTH
     */
    public static void str2() {
        String b = "Brijesh";
        System.out.println(b.length());
    }

    /*
     * STRING CONCATENATION
     */
    public static void str3(){
        String first_name = "Brijesh";
        String middle_name = "Kishore";
        String last_name = "Purohit";

        String My_name = first_name + " " + middle_name + " " + last_name;
        System.out.println("I am: "+ My_name);
        // print word by index number
        System.out.println(My_name.charAt(0));
        //print 1 by 1 every element from a string 
        for (int i = 0; i < My_name.length(); i++) {
            System.out.println(My_name.charAt(i));
        }
    }

    /*
     * DIFFERENCE BETWEEN A STRING AND A NEW DEFINE STRING
     */
    public static void str4() {
        String d = "Brijesh";
        String e = "Brijesh"; // this point a pre created string 
        String f = new String("Brijesh"); // this will create a new string
        if (d==e) { 
            System.out.println("Same string found");
        } else {
            System.out.println("Not found");
        }

        if (f==e) { 
            System.out.println("Same string found");
        } else {
            System.out.println("Not found");
        }
    }

    /*
     * SUB STRING: CONTINUE WORD SUB PART IN A STRING
     * SUBSEQUENCE: RANDOM WORDS IN ASTRING MADE A SMALL STRING
     */
    public static void str5() {
        String e = "Brijesh Kishore Pureohit";
        
        System.out.println(e.substring(2, 5));
    }
    
    /*
     * TO STRING FUNCTION CAN CONVERT ANY THING IN TO STRING 
     */
    public static void str6() {
        String f = "Brijesh Kishore Pureohit";
        f.toString();
        Integer x = 4; // int|char... is not allowed, Integer | Character....
        x.toString();

    }

    /*
     * String Builder: we can modifie our String 
     */
    public static void str7() {
        StringBuilder g = new StringBuilder("");
        for (char i = 'a'; i < 'z'; i++) {
            g.append(i);
            
        }
        System.out.println(g);
    }

    /*
     * String Compression
     * example
     * given string : aaabbbbbcdd
     * solution: a3b5c1d2
     */
public static void str8() {
    // String h = "aaaabbbccdd";
    // String i = "";
    // for(int j = 0; j<h.length(); j++){
    //     Integer count = 0;
    //     while(j < h.length()-1 && h.charAt(j)==h.charAt(j+1)){
    //         count++;
    //         j++;
    //     }
    //     i += h.charAt(j);
    //     if(count > 0){
    //         i += count.toString();
    //     }
    // }
    // System.out.println(compress(i));
}

    

    public static void main(String[] args) {

        str1();
        str2();
        str3();
        str4();
        str5();
        str6();
        str7();
        str8();
    }
}
