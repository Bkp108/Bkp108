// Class name starts with a capital letter
class Student {
    String name;
    int uid;
    int maths;
    int phy;
    int chem;

    // Setter methods to set the values of instance variables
    void setname(String name) {
        this.name = name; // Use "this" to refer to the instance variable
    }

    void setuid(int uid) {
        this.uid = uid;
    }

    void setmaths(int maths) {
        this.maths = maths;
    }

    void setphy(int phy) {
        this.phy = phy;
    }

    void setchem(int chem) {
        this.chem = chem;
    }

    // Method to calculate the percentage
    void calpercentage() {
        int percentage = (phy + maths + chem) / 3;
        System.out.println("Percentage: " + percentage);
    }
}

public class OOP {
    public static void main(String[] args) {
        // Creating an object of the Student class
        Student s1 = new Student();
        
        // Setting values using setter methods
        s1.setname("Brijesh");
        s1.setuid(8816);
        s1.setmaths(98);
        s1.setphy(89);
        s1.setchem(70);
        
        // Calling the method to calculate and print the percentage
        s1.calpercentage();
    }
}
