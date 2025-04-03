// package JAVA.THEORY_JAVA.18 Constructor in Inheritance;

class Base1 {
    Base1(){
        System.out.println("Ma 1 constructor huuuuu");
    }
    Base1(int x){
        System.out.println("I am a overload constructor with value of x is: "+x);
    }
}


class Derive extends Base1{ // here 1st priority is to base class then derive class 
    Derive(){
        super(0); //  if 1st want to give value from derive then go to base1 class then we use super class 
        System.out.println("I am a Derive class Constructor"); 
    }
       
 }

public class con_inhe2 {
    public static void main(String[] args){
        // Base1 b = new Base1();

        // Derive d1 = new Derive();
    }
}
