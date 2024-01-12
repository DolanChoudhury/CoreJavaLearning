package src.OOPS_07_30Dec;

public class Lab_113 {
    public static void main(String[] args) {
        //print multiple of a number 4 times
        System.out.println(multiple_table(5));
        System.out.println(multiple_table(10));

        double x=Math.pow(2,2);   //inbuild funvtion
        System.out.println(x);

    }





    static int multiple_table(int a){
    System.out.println("Multiple of " + a + " is:");

    for(int i=1; i<=10;i++) {

        int b = a * i;
        System.out.println(a +" X "+ i+ " = "+ b);
    }
    return(a);
    }
}
