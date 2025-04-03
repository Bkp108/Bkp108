// package JAVA.THEORY_JAVA.20 Overriding;
/*
 * Method Overriding:: here we extends a in b but we want meth2 of b separate dont use class A meth2
 * so here we use method overrriding
 */

class A{
    public int a;
    public int abc(){
        return 4;
    }

    public void meth2(){
        System.out.println("2 of A");
    }

    public void meth2(int a){ // this is not taking part in overriding
        System.out.println("2 of A");
    }
}

class B extends A{
    @Override  // it is not important to write , it is just to tell that the methode is overriding 
    public void meth2(){
        System.out.println("2 of B");
    }
    
    public void meth3(){
        System.out.println("3 of B");
    }
}
public class overriding {
    public static void main(String[] args){
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2(); 
    }
}
