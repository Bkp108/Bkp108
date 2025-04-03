// -----------------------------------------------------------------------------------------------

class Employee {
    int id;
    String name;
    String section;
    float age;

    // create a class who print all detail
    public void printclass() {
        System.out.println("ID is:     " + id);
        System.out.println("Name is:   " + name);
        System.out.println("section is:" + section);
        System.out.println("Age is:    " + age);
    }

    // separate class for all printing detail
    public void getid() {
        System.out.println("The id is: " + id);
    }

    public void getname() {
        System.out.println("The name is: " + name);
    }

    public void getsection() {
        // System.out.println("The section is:",+section);
    }

    public void getage() {
        System.out.printf("The age is:%f\n", +age);
    }
}

public class java_class5 {

    public static void main(String[] args) {
        Employee ep1 = new Employee();
        ep1.name = "Brijesh Kishore Purohit";
        ep1.id = 8816;
        ep1.section = "21AML-12(A)";
        ep1.age = 18.80f;

        // System.out.printf("ID is: %d",ep1.id);
        // System.out.printf("\nName is: %s",ep1.name);
        // System.out.printf("\nsection is: %s",ep1.section);
        // System.out.printf("\nAge is: %f",ep1.age);
        System.out.println("----------------------------------------------------------");
        // now i am creating a void class in a employee class so i dont need to print
        // every time just call print class

        ep1.printclass();

        Employee ep2 = new Employee();
        ep2.id = 8786;
        ep2.name = "shivam";
        ep2.section = "21AML-2(B)";
        ep2.age = 21.7f;

        ep2.printclass();
        System.out.println("----------------------------------------------------------");

        ep1.getid();
        ep2.getid();
        ep1.getname();
        ep2.getname();
        // ep1.getsection();
        // ep2.getsection();
        ep1.getage();
        ep2.getage();

    }
}
