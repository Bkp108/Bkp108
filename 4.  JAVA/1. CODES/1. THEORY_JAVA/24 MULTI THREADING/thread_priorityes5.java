class mythr extends Thread {
    public mythr(String name) {
        super(name);
    }

    public void run() {
        // while(true){
        // System.out.println("I am a Thread");
        // }

    }
}

public class thread_priorityes5 {
    public static void main(String[] args) {
        mythr t = new mythr("Brijesh Kishore Purohit");
        t.start();
        mythr t2 = new mythr("VISHESH KISHORE PUROHIT");
        t2.start();
        mythr t3 = new mythr("asdfghjk");
        t3.start();
        mythr t4 = new mythr("qwertyuio");
        t4.start();
        mythr t5 = new mythr("zxcvbnm,");
        t5.start();
        mythr t6 = new mythr("zsdrtyjm,mnbvcx");
        t6.start();

        t3.setPriority(Thread.MAX_PRIORITY);
        t5.setPriority(Thread.MIN_PRIORITY);
        

    }
}
