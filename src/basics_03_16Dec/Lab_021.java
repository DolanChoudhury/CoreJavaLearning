package src.basics_03_16Dec;

public class Lab_021 {
    public static void main(String[] args) {
        //relational operator interview question
        //character/any other data type in print statement comparison is integer/ASCII value(internally) but will be printed as Character

        System.out.println('A'==64);
        System.out.println('A'==65);
        System.out.println('Z'==90);

        long b=65;
        int a=65;
        System.out.println(65 == b);
        System.out.println(a==b);
        System.out.println('A'==b);
        System.out.println('A'==65.0); //True
        System.out.println('A'==65.2); //False

       // System.out.println(true == 1);  //can ot compare bool with int
        // System.out.println(true == true);  //no comparison between booleans
    }
}
