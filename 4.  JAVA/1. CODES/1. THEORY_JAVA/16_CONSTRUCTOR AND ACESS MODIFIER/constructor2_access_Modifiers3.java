// package JAVA.THEORY_JAVA.14_OOP'S;
/*
 * ACCESS MODIFIERS:: specifier where a property / method accessible.
 * THERE ARE 4 TYPE OF ACCESS MODIFIER::
 * 1. private
 * 2. public
 * 3. default
 * 4. protected
 * 
 * 
 * GETTER AND SETTER
 *  getter --> retuen the value 
 * setter --> set/update the value
 */


/*
 * modifier     class               package             subclass                woeld
 * 
 * public       yes                 yes                  yes                      yes
 * protected    Yes                 Yes                 Yes                         no
 * default       yes                 yes                 no                      no
 * private       yes                 no                 no                      no
 */
class Myemployee{

    private int id;
    private String name;

    public String getname(){
        return name;
    }

    public void setname(String n){
        name = n;
    }

    public void setid( int i){
        id =i; 
    }

    public int getid(){
        return id;
    }
}
public class constructor2_access_Modifiers3 {
    public static void main(String[] args){
         Myemployee e1 = new Myemployee();
         e1.setname("BRIJESH KISHORE PUROHIT");
         System.out.println(e1.getname());
         
         e1.setid(8816);
         System.out.println(e1.getid());



         Myemployee e2 = new Myemployee();
         e2.setname("SHIVAM SINGH");
         System.out.println(e2.getname());
         
         e2.setid(11532);
         System.out.println(e2.getid());



         Myemployee e3 = new Myemployee();
         e3.setname("HARSH HARSHIT");
         System.out.println(e3.getname());
         
         e3.setid(9872);
         System.out.println(e3.getid());
    }
}




