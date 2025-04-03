/*
 * 
 */

interface sample1{
    void meth1();
    void meth2();

}



interface sample2 extends sample1{   // if i write class sample extends sample 1 then a class cant extends a interface so we need to write implement
    void meth3();
    void meth4();
}



class sampleclass implements sample2{
    // in this implements sample2 here sample 1 and 2 both include
    public void meth1(){
        System.out.println("METHOD 1");
    }

    public void meth2(){
        System.out.println("METHOD 2");
    }

    public void meth3(){
        System.out.println("METHOD 3");
    }

    public void meth4(){
        System.out.println("METHOD 4");
    }
}




public class inheritance_interface {
    
}
