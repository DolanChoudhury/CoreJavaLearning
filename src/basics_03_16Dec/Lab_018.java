package src.basics_03_16Dec;

import java.sql.SQLOutput;

public class Lab_018 {
    public static void main(String[] args) {
        int A = 20;
        int B = 30;
        String Name = "Riya";

        //Addition
        System.out.println(A+B);

        //Concatenation (string+something)
        System.out.println(Name+A);
        System.out.println(Name+A+B);
        System.out.println(A+Name+B);

        //Since calculation always happens from left to right, first it's addition between int and last one concatenation
        System.out.println(A+B+Name);

    }
}
