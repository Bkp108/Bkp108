// package JAVA.THEORY_JAVA.17 INHERITANCE;
/*
 * Inheritance is used to BORROW PROPERTIES and METHODS from an existing class
 * 
 * in java inheritance is declaring by """extends"" keywords
 */

class Base{
    int x;

    public int getx(){
        return x;
    }

    // public void setx(int x){
    //     System.out.println("I am seting x now:");
    //     this.x = x;
    // }

    // public void printme(){
    //     System.out.println("I am a constructor!");
    // }

}
/*
 * Now, here i want to create a more class for 'y', but
 * those student who dont know the concept of inheritance they create full class the constructors then give variable's and .........
 * but we know the concept of INHERITANCE SO now we are creating a inheritance
 */

 //NOW i am introducing the INHERIATENCE
 class Derive extends Base{
    int y;

    public int gety(){
        return y;
    }

    // public void sety(int y){
    //     this.y = y;
    // }
 }

 // in this class 'x', and 'y' both variable are their x is from inherit Base class and y is defined 
public class inheritance1 {
    public static void main(String[] args){
        // Base b = new Base();
        // b.setx(5);
        // System.out.println(b.getx());

        // now if i do same in Derive class the result is same because Derive class inherit Base class
        Derive db = new Derive();
        // db.setx(5);
        System.out.println(db.getx());
        // db.printme();
    }
}
