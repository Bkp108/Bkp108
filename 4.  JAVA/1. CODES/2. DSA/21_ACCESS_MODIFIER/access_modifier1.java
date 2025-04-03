/*
 * ACCESS MODIFIER                CLASS              PACKAGE            OPTSIDE PACKAGE(SUBCLASS)        OUTSIDE PACKAGE  
 * 1. private                       Y                   N                          N                           N  
 * 2. default                      Y                    Y                                                     N  
 * 3. protected                      Y                 Y                          Y                           N  
 * 4. public                      Y                    Y                          Y                           Y  
 * 
 */

class BankAccount{
    public String username;
    private String password;

    public void setpassword(String psw){
        password = psw;
    }
}

public class access_modifier1 {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount();
        a1.username("Brijesh Kisahore Purohit");
        // a1.password this will give an error because we are defining a privarte function out side a class
        a1.setpassword("09Dec2004@$");
    }
}
