// package JAVA.THEORY_JAVA.21 Abstract class and interface;
/*
 * ABSTRACT CLASS:::
 * abstract in english means--> existing in through or as an idea without cocreate existance
 * 
 * ABSTRACRT METHOD:::::
 * a method that is declared without an implementation 
 * 
 * ABSTRACT CLASS:::::
 * if a class include abstract method, then the class itself must be declared abstract as in:
 */


abstract class parents2{
    public parents2(){
        System.out.println("ma base class ka constructor huuuuuuuuuuuuuuu");
    }

    public void hello(){
        System.out.println("ma to aasa hi banaya ya giyta huuuuuu");
    }
    abstract public void green(); // it is compalsery that if you create a abstract object  then you have to declare the class as abstract
    abstract public void green2();
    
}

class child2 extends parents2{
    public void green(){
        System.out.println("GOOD MORNING");
    }
    public void green2(){
        System.out.println("GOOD NIGHT");
    }
}

abstract class child3 extends parents2{
    public void th(){
        System.out.println("I am good , how are you,  BRIJESH KISHORE PUROHIT");

    }
    
}
public class abstract_and_interface {
    public static void main(String[] args){
        // child3 c = new child2();
        // parents2 p2 = new parents2();  this parents2 class cannot made object because it is abstract class
    }
}





