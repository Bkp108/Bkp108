// package JAVA.THEORY_JAVA.15_CONSTRUCTOR;
// BASIC CONSTRUCTER FORMATE

class Base { // THIS IS BASIC CLASS
    int x;
    int y;

    Base() { // THIS IS CONSTRUCTOR
        System.out.println("BRIJESH KISHORE PUROHIT 21BCS8816");
    }
}

/*
 * CONSTRUCTORS:::
 * a member function used to initialize an object while c reating it
 * 
 * 
 * in order to write our own constructor, we define a method with name same as
 * class name
 */
class empp {

    private int id;
    private String name;

    public String getname() {
        return name;
    }

    /*
     * this is constructor
     */
    // DEFAULT VALUES FOR CONSTRUCTORS
    public empp() {
        id = 1234567890;
        name = "BRIJESH KISHORE PUROHIT";
    }

    // GIVEN VALUES TO CONSTRUCTOR
    public empp(String myname) {
        id = 444444444;
        name = myname;
    }

    public empp(String myname, int nid) {
        id = nid;
        name = myname;
    }

    // conster overloding is allowed like in last 3 class with same name but
    // different attribute
    // ---------------------------------------------------------------------
    public void setname(String n) {
        name = n;
    }

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }
}

public class constructoe1 {
    public static void main(String[] args) {
        empp a = new empp("Brijesh", 1212121);
        System.out.println(a.getid());
        System.out.println(a.getname());

        /*
         * the first priority is to print that item given in this
         * empp a = new empp("Brijesh", 444);
         * in case ther is no item is give ::empp a = new empp();
         * then java take defaultly class variables
         */

        empp ab = new empp();
        System.out.println(ab.getid());
        System.out.println(ab.getname());
    }
}
