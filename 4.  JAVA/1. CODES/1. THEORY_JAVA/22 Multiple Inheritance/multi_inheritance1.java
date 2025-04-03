//     package JAVA.THEORY_JAVA.22 Multiple Inheritance;
/*
 * In java multiple inheritance is not allowed So we use multiple interface and extend 1 class 
 * mean extend 1 class and implement a, b, c, d.....
 */

 /*
  * THE BEST EXAMPLE TO EXPLAIN THE INTERFACE AND CLASS IN INHERITANCE
  we have SMART PHONE
  it is a phone (CLASS)
  it have gps, camera, media player(INTERFACE'S)



  in java only 1 class is allowed and many interfaces 
  */

interface Camera{
    void takeSnap();
    void recordVideo();
    default void record4k(){
        System.out.println("4K HD");
    }
}

interface wifi{
    String[] getnetworks();
    void ConnetToNetwork(String network);
}

class MycellPhone{
    void callNumber(int phonenumber){
        System.out.println("calling: "+phonenumber);
    }
    void pickcall(){
        System.out.println("Connecting............");
    }


}


class MySmartPhone extends MycellPhone implements wifi, Camera{
    public void takeSnap(){
        System.out.println("this is snap interface ,defined in class Smart phone");
    }
    
    public void recordVideo(){
        System.out.println("this is a record video interface, taking video.............");

    }


    public String[] getnetwork(){
        System.out.println("Getting list of network: ");
        String[] networklist = {"a", "b", "c", "d"};

        return networklist;
    }

    public void ConnecToNetwork(String network){
        System.out.println("Connecting....."+network);
    }

    @Override
    public String[] getnetworks() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getnetworks'");
    }

    @Override
    public void ConnetToNetwork(String network) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ConnetToNetwork'");
    }
}
public class multi_inheritance1 {
    public static void main(String[] args){
        MySmartPhone m1 = new MySmartPhone();
        m1.getnetwork();
        m1.takeSnap();

    }
}
