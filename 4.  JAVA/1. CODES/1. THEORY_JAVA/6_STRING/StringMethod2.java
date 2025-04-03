// package JAVA.T.5_StringInJava;

public class StringMethod2 {
    public static void main(String[] args){
        String a = new String("The Brijesh Kishore Purohit");
        
        int b = a.length();
        System.out.println(b);

        String c = a.toLowerCase();
        System.out.println(c);

        String d = a.toUpperCase();
        System.out.println(d);

        String e =a.trim();
        System.out.println(e);
        
        String f = a.substring(0, 5);
        System.out.println(f);

        String g = a.replace('K', '3');
        System.out.println(g);

        System.out.println(a.startsWith("The"));
        System.out.println(a.endsWith("op"));
        System.out.println(a.contains("Purohit"));

        System.out.println(a.charAt(5));
        System.out.println(a.indexOf("Bri"));
        
    }
}
