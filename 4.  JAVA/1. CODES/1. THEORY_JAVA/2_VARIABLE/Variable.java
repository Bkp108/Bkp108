// package JAVA.T.2_Variables;

public class Variable {
    public static void main(String[] args){
        /*
         *                                          DATA TYPES
         *        Premitive variables                                            Non-Premative variables
         *             Int (4 bytes)                                                          Array
         *             Double (8 bytes)                                                       String
         *             Float(4 bytes)
         *             long(8 bytes)
         *             short(2 bytes)
         *             boolean (1 bit)
         *             char(2 bytes)
         *             byte(2 bits)
         * 
         */ 
        int var1 = 4; 
        int var2 = 5;
        float var3 = 1.0f;
        double var4 = 2.0;
        long var5 = 3;
        short var6 = 4;
        boolean var7 = true;
        char var8 = 'a';
        byte var9 = 5;

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);
        System.out.println(var9);
        
        System.out.println(var1 == var2);
        System.out.println(var1 == var3);
        
        float sum = var1 + var2 + var3;
        System.out.println(sum);

        
    }

}


// public class A  
// {  
//     static int m=100;//static variable  
//     void method()  
//     {    
//         int n=90;//local variable    
//     }  
//     public static void main(String args[])  
//     {  
//         int data=50;//instance variable    
//     }  
// }