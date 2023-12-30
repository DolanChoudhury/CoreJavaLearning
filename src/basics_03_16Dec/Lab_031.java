package src.basics_03_16Dec;

public class Lab_031 {
    public static void main(String[] args) {
        int a = 100;
        long b = a; //widening--valid implicit casting since long>int
         long b1 = (long)a; // valid explicit casting
        System.out.println(b1);

//        byte c = a;  //narrowing--not allowed implicit since byte<int
          byte c1= (byte)a; // valid explicit casting
        System.out.println(c1);
    }
}
