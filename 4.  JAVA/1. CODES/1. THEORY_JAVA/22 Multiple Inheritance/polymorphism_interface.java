
interface camera2{
    void takesnap2();
    void recordvideo2();
    void record4k();
}

interface wifi2{
    String[] getnetworks2();
    void connectnetwork2(String network);
}

class cellphone2{
    void callnumber2(int phonenumber){
        System.out.println("calling: "+phonenumber);
    }
    void pickcall2(){
        System.out.println("Connecting............");
    }


}


class Smartphone2 extends cellphone2 implements wifi2, camera2{
    public void takesnap2(){
        System.out.println("this is snap interface ,defined in class Smart phone");
    }
    
    public void recordvideo2(){
        System.out.println("this is a record video interface, taking video.............");

    }


    public String[] getnetwork2(){
        System.out.println("Geting list of network: ");
        String[] networklist = {"a", "b", "c", "d"};

        return networklist;
    }

    public void connetnetwork2(String network){
        System.out.println("Connecting....."+network);
    }

    @Override
    public void record4k() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'record4k'");
    }

    @Override
    public String[] getnetworks2() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getnetworks2'");
    }

    @Override
    public void connectnetwork2(String network) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'connectnetwork2'");
    }
}



public class polymorphism_interface {
    public static void main(String[] args){
        camera2 c2 = new Smartphone2();  // here we are using smart phone as a camera
        c2.takesnap2();
    }
}
