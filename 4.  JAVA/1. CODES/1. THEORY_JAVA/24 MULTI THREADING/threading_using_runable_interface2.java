/*
 * THIS IS SECOND METHOD TO RUN THREAD
 */

class mythreadrunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("1111111111111111111111");
            i++;
        }
    }
}

class mythreadrunnable2 implements Runnable {
    public void run() {
        int j = 0;
        while (j < 100) {
            System.out.println("22222222222222222222222");
            j++;
        }
    }
}

public class threading_using_runable_interface2 {
    public static void main(String[] args) {
        mythreadrunnable1 t1 = new mythreadrunnable1(); // gun
        Thread a = new Thread(t1); // this is bullet applying in gun
        mythreadrunnable2 t2 = new mythreadrunnable2(); // gun
        Thread b = new Thread(t2);

        a.start();
        b.start();
    }
}
