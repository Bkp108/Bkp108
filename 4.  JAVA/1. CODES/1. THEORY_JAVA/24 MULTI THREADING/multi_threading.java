// package JAVA.THEORY_JAVA.24 MULTI THREADING;
/*
 * multi processing and multi threading both are used to achive multltasking
 * 
 * flow without threading
 * main-->function-->function-->end
 * 
 * flow with thread
 * main----------|
 *               |
 * function------|=====end
 *               |
 * function------|
 * 
 * 
 * creating thread 2 method
 * 1. by extending thread class
 * 2. by implement runnable interface
 * 
 * 
 * 
 */

 /*
  * THIS IS FIRST METHOD TO RUN THREAD
  */
class mythread1 extends Thread{
    @Override
    public void run(){
        int i = 0;

         while (i<10) {
            System.out.println("1111111111");
            // System.out.println("1111111111");
            i++;
         }
    }
}



class mythread2 extends Thread{
    @Override
    public void run(){
        int i =0;
         while (i <10) {
            System.out.println("2222222222");
            // System.out.println("2222222222");
            i++;
         }
    }
}




public class multi_threading {
    public static void main(String[] args){
        mythread1 t1 = new mythread1();
        mythread2 t2 = new mythread2();

        t1.start(); // this is important to start a thread
        t2.start();
    }
}
