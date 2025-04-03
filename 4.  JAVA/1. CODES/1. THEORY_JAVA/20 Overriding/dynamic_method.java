// package JAVA.THEORY_JAVA.20 Overriding;


class one{
    public void green(){
        System.out.println("Good Moring");
    }

    public void name(){
        System.out.println("I am studing Java:::");
    }
}

class two extends one{
    public void yellow(){
        System.out.println("Good Night");
    }

    public void name(){
        System.out.println("My name is brijesh kishore purohit, i am from rajasthan ");
    }
}
public class dynamic_method {
    public static void main(String[] args){
        // one o = new one();
        // two t = new two();

        // now we can combine both class and make a single constructor

        one o1 = new two(); // valid because two extends one
        // two t1 = new one(); // not valid because one not extends two

        o1.name();
    }
}
