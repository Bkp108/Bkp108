public class Methods2 {
        static void change1(int x){
            x = 98;
            // System.out.println(x);
        }
        static void change2(int [] b){
            b[0] = 98;
        }
        public static void main(String[] args) {
            int a = 23;
            change1(a);
            System.out.println(a);    
            
            int [] b = {1, 2, 3, 4, 5, 6};
            change2(b);
            System.out.println(b[0]);
       }
}