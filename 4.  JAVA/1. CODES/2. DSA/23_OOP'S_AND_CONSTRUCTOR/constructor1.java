/*
 ? THERE ARE MAINLY 4 IMPORTANT PILLOR'S OF OOP'S
 ! 1. ENCAPSULATION:
 * ENCAPSULATION IS DEFINED AS THE WRAPPING UP OF DATA AND METHOD UNDER A SINGLE UNIT. IT ALSO IMPLEMENTS DATA HIDING
 ! 2. INHERITANCE
 ! 3. ABSTRACTION
 ! 4. POLYMORPHISM
 */

/*
 ? CONSTRUCTOR:
 ! CONSTRUCTOR IS A SPECIAL METHOD WHICH IS INVOKED AUTOMATICALLY AT THE TIME OF OBJECT CREATION
 * have same name as   CLASS | STRUCTURE   have
 * there is no return type of constructor
 * constructure are only called once, at object creation
 * memory allocation is happend whenm constructure is called
 */

/*
 ? There are 3 main type of constructor's
 * 1. None-parameterized
 * 2. parameterized
 * 3. Copy Constructor
 */

/*
 ! NON- PARAMETERIZED CONSTRUCTOR
 */
class Student1 {
    String name;
    int uid;

    Student1() {
        System.out.println("Non parameterized Constructor is called....!");
        
    }
}

/*
 ! PARAMETERIZED CONSTRUCTOR
 */
class Student2 {
    String name;
    int uid;

    Student2(String name) {
        this.name = name;
    }

    Student2(int uid) {
        this.uid = uid;
    }

}

/*
 ! COPY CONSTRUCTOR
 ? java dont provide copy constructor, we have to create a copy constructor
 */
class Student3 {
    String name;
    int uid;
    String password;

    Student3(Student3 s31) {
        this.name = s31.name;
        this.uid = s31.uid;        
    }
}


public class constructor1 {
    public static void main(String[] args) {
        /*
         ! NON- PARAMETERIZED CONSTRUCTOR
         */
        // Student1 s11 = new Student1();
        
        /*
         ! PARAMETERIZED CONSTRUCTOR
         */
        // Student2 s21 = new Student2("Brijesh");
        // s21.uid = 8816;
        // System.out.println(s21.name);
        // System.out.println(s21.uid);


        /*
         ! COPY CONSTRUCTOR
         ? java dont provide copy constructor, we have to create a copy constructor
         */
        Student3 s31 = new Student3();
        s31.name = "Brijesh";
        s31.uid = 8816; 
        s31.password = "abcd";
        
        Student3 s32 = new Student3(s31);
        s32.password = " vhjmd,";

    }
}
