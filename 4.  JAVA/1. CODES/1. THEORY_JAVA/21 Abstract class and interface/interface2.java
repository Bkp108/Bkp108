/*
 * INTERFACE:::::
 * interface in english is a point where two system meet and interact
 * in java interface is a group of related methods with empty bodies
 * 
 * in interface all variable are FINAL can't change
 */
interface bicycle { // interface force that you have to apply this function when you apply bicycle
                    // class
    int tit = 34;

    void applybrake(int decrement);

    void speedup(int increment);

}

// part 2-----------------------------
interface second {
    void seconda(int x);

    void secondb(int a, int b);
}

// -------------------------
class a1cycle implements bicycle, second {
    void blowhorn() {
        System.out.println("pee peeeeeeeeeeeeeeeeeeeee");
    }

    public void applybrake(int decrement) { // you have to make 'public ' class in interface
        System.out.println("Apply break");
    }

    public void speedup(int increment) {
        System.out.println("Apply acceleter");
    }

    // -----------port 2---------------
    public void seconda(int x) {
        System.out.println("The x is: " + x);
    }

    public void secondb(int x, int y) {
        System.out.println("The value of y is: " + y);
    }
    // --------------------------------------------
}

public class interface2 {
    public static void main(String[] args) {
        a1cycle aa = new a1cycle();
        aa.applybrake(3);
        // System.out.println(aa.tit);

        // part 2--------------------------
        aa.seconda(5);
        aa.secondb(567, 8);

        /*
         * we can apply more than one interface but cant made more than one abstract in
         * a class
         */

    }
}