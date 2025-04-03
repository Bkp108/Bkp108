
/*
 * get is to return value
 * set is to modifie value
 * 
 * this is the keyword
 * this keyword is used to refer to the current object
 */
/*
 * when we have some restricted class or access modifier then we use to getter and setter to access and modifer
 */
class Student {
    String name;
    int uid;

    // Setter methods to set the values of instance variables
    void setname(String name) {
        this.name = name; // Use "this" to refer to the instance variable
    }

    void setuid(int uid) {
        this.uid = uid;
    }

    String getname(){
        return this.name;
    }

    int getuid(){
        return this.uid; // Corrected to return uid instead of name
    }
}

public class getter_setter1 {
    public static void main(String[] args) {
        Student s2 = new Student();
        s2.setname("Brijesh Kishore Purohit");
        System.out.println(s2.getname()); // Corrected to use s2.getname()

        s2.setuid(8816);
        System.out.println(s2.getuid()); // Corrected to use s2.getuid()
    }
}
