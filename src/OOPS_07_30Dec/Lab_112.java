package src.OOPS_07_30Dec;

public class Lab_112 {
    public static void main(String[] args) {
        int sum1 = sum_of_two(5,8);     //function call
        System.out.println(sum1);

        int c1 = sum_of_two(100);
        System.out.println(c1);

        SayHi();  //void function/no return type

    }

    static int sum_of_two(int a, int b) {    //defination of fuction
        int sum = a + b;
        return sum;
    }

    static int sum_of_two(int c){
        return c;
    }

    static void SayHi() {
        System.out.println("Hiiii!");

    }
}
