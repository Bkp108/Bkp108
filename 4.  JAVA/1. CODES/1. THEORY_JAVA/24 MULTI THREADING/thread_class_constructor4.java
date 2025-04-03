/*
 * JAVA THREAD CLASSES
 * 1. Thread()
 * 2. Thread(String name)
 * 3. Thread(Runnable)
 * 4. Thread(Runnable, String name)
 */
// import java.lang.*;
class mythr extends Thread{
    public mythr(String name){
        super(name);
    }
    public void run(){
        // while(true){
        //     System.out.println("I am a Thread");
        // }
        
    }
}

public class thread_class_constructor4 {
    public static void main(String[] args) {
        mythr t = new mythr("Brijesh Kishore Purohit");
        t.start();
        mythr t2 = new mythr("VISHESH KISHORE PUROHIT");
        t2.start();
        // System.out.println("the id of thread is: "+t.getId());
        System.out.println("the id of thread is: "+t.getName());
        System.out.println("the id of thread is: "+t.toString());
        // System.out.println("the id of thread is: "+t2.getId());
        System.out.println("the id of thread is: "+t2.getName());
        System.out.println("the id of thread is: "+t2.toString());
        
    }
}
