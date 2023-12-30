package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab_068 {
    public static void main(String[] args) {
        //Solve 3/(a^2+b^2-|c|)

        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a number for a");
        double a = sc.nextDouble();


        System.out.println("Enter a number for a");
        double b = sc.nextDouble();


        System.out.println("Enter a number for a");
        double c = sc.nextDouble();

        double result;
        result = Math.cbrt(Math.pow(a,2)+Math.pow(b,2)-Math.abs(c));
        System.out.println(result);

        sc.close();
    }
}
