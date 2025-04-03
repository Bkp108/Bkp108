/*
 * it will first run first thread class completely then run second thread
 * 
 * in try catch: 
 * first try join function if it work then fine else catch a exception and run
 */
class M1 extends Thread{
    @Override
    public void run(){
        int i = 0;

         while (i<100) {
            // System.out.println("My thread is running11111111111111111111111111");
            System.out.println("i am happy111111111111111111111111111111111111");
            i++;
         }
    }
}

class M2 extends Thread{
    @Override
    public void run(){
        int i = 0;

         while (i<100) {
            // System.out.println("My thread is running11111111111111111111111111");
            System.out.println("i am happy-------------------------------");
            i++;
         }
    }
}
public class thread_Methods6 { 
    public static void main(String[] args) {
        M1  t1 = new M1(); // gun
        M2  t2 = new M2(); // gun
        t1.start();
        try {
            t1.join(); // this tell us that first run 1st thread then go to another thread
        } catch (Exception e) {
            System.out.println(e);
        }
        t2.start();
        }
}

