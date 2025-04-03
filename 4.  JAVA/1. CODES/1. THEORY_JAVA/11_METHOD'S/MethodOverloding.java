public class MethodOverloding {
    static void f(){
        System.out.println("Good Moring Bro!");
    }

    static void f(int a){
        System.out.println("Good Morning " + a + " Bro!");
    }

    static void f(int a, int b){
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morining " + b + " Bro!");
    }
    public static void main(String[] args) {
        /*
         * Two or more methods can have same name but having different parameters 
         * Such methods are called Method Overloding 
         * 
         * Overloding function's
        * 1. void foo()
         * 2. void foo(int a)
         * 3. void foo(int a, int b)
         */

         f();
         f(10);
         f(1,2);
    }
}
