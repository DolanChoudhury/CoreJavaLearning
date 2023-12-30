package src.basics_03_16Dec;

public class Lab_029 {
    public static void main(String[] args) {
        //created in string constant pool of heap area
        String a =  "Riya";

        //created in object area
        String b = new String("Riya");

        //compare value
        System.out.println(a.equals(b));
        //compare referance
        System.out.println(a==b);

    }
}
