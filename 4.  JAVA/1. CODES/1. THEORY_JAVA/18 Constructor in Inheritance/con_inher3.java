// package JAVA.THEORY_JAVA.18 Constructor in Inheritance;
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
        // super(0); //  if 1st want to give value from derive then go to base1 class then we use super class 
        System.out.println("I am a Derive class Constructor"); 
    }
    Derive(int x, int y){
        super(x);
        System.out.println("I am a overloaded constructor with value of y is: "+y);
    }    
    
 }

 class child extends Derive{
    child(){
        System.out.println("i am the inherite class with name Child, i inherit deriva and derive inherite Base class");
    }

    child(int x, int y, int z){
        super(x, y);
        System.out.println("I am a overloded constructor with value of z is: "+z);
    }
 }

public class con_inher3 {
    public static void main(String[] args){
        // Base1 b = new Base1(); // s1:::: he print hime self

        // Derive d1 = new Derive(5, 84); //s2:::: he print 1st base then derive
        /*
         * first value go to derive --> derive say go to base1 --> base1 take value from super keyword
         */
        child c1 = new child(2, 54, 345678); // s3:::: he print base then derive then child/hime self
    }
}