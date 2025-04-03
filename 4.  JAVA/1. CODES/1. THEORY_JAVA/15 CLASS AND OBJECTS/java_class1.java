 // package JAVA.THEORY_JAVA.14_OOP'S;
/*
 * TO CREATE CLASS ::::
 * 1ST CREATE A CLASS OUT SIDE OF MAIN CLASS
 * 2ND DEFINE OUR CLASS OBJECTS INSIDE MAIN CLASS
 */

//Defining a Student class.  
class Student{  
    //defining fields  
    int id;//field or data member or instance variable  
    String name;  
    //creating main method inside the Student class  
    public static void main(String args[]){  
     //Creating an object or instance  
     Student s1=new Student();//creating an object of Student  
     //Printing values of the object  
     System.out.println(s1.id);//accessing member through reference variable  
     System.out.println(s1.name);  
    }  
}