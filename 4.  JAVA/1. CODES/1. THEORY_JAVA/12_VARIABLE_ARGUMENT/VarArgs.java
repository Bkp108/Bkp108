// package JAVA.T.12_VariableArguments;

public class VarArgs {

    // FIRST METHOD

    // static int sum(int a, int b){
    //     return a+b;
    // }

    // static int aum(int a, int b, int c){
    //     return a+b+c;
    // }

    // static int sum(int a, int b, int c, int d){
    //     return a+b+c+d;
    // }





    // SECOND METHOD

    static int sum(int ...arr){    // HERE '...arr ' say that take how many argument you want and pack in array
        int r = 0;
        for(int x: arr){
            r +=  x;
        }
        return r;
    }


// WE want 1 variable fix
    static int sum1(int x, int ...arr){    // HERE '...arr ' say that how many argument you want and pack in array
        int r = x;
        for(int y: arr){
            r +=  y;
        }
        return r;
    }

    public static void main(String[] args){
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1, 2, 3, 5, 6));
        System.out.println(sum(1, 2, 3, 4, 5, 6,7));
        System.out.println(sum(1, 2, 3, 4 ,5 ,6));


// here automatically 1st value is taken as a compelsery variable 'x'
        System.out.println(sum1(1, 2, 3));
        System.out.println(sum1(1, 2, 3, 4));
    }
}
