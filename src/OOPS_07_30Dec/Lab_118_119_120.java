package src.OOPS_07_30Dec;

public class Lab_118_119_120 {
    public static void main(String[] riya) {
        Name("Riya ");
        Return("Hello! ");

        int i=10;
        System.out.println(--i +  i++ + i-- );
    }

    public static String Name(String n){
        System.out.printf("Hi! %s", n );      //formating
        return n + "Choudhury";
    }

    public static void Return(String a){
        System.out.println(a+" Hi!");}
}
