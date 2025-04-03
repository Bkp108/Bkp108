// package JAVA.THEORY_JAVA.18 Constructor in Inheritance;
/*
 * 
 */
class Base1 {
    Base1(){
        System.out.println("Ma 1 constructor huuuuu");
    }
    
    public int x;
    
    
    public int getx(){
        return x;
    }

    public void setx(int x){
        this.x = x;
    }
}


class Derive extends Base1{ // here 1st priority is to base class then derive class 
    Derive(){
        System.out.println("I am a Derive class Constructor"); 
    }
        
    
 }

public class con_in_inheritance1 {
    public static void main(String[] args){
        // Base1 abc = new Base1();

        // Derive d = new Derive();
    }
}
