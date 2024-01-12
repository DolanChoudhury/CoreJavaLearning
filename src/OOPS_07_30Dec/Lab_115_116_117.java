package src.OOPS_07_30Dec;

public class Lab_115_116_117 {
    public static void main(String[] args) {    //JVM RECOGNIZES ONLY "public static void main(String[]"       the referance name "args" can be changed to anything
        System.out.println(args[0]);
        System.out.println(args[1]);
        //System.out.println(args[2]);  //error since value not provided in configuration

        main(1);
        main(8,10);
    }
    public static void main(int a) {
        System.out.println("U can have multiple main function but with different arguments. It is called method overloading");
        main(8,10);
    }

    public static int main(int g, int h){
        System.out.println("Hii!");
    return g;
    }
}
