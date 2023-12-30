package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab_045_046_047_048 {
    public static void main(String[] args) {
        if ((9 + 10) < 20) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        //even odd
        System.out.println("Finding even or odd");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you if it is even or odd: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("It is an even number!");
        } else {
            System.out.println("It's an odd number!");
        }

        //max of two number
        System.out.println("Finding max of two numbers");
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b =sc.nextInt();
        if(a>b){
            System.out.println(a +" is greater than "+b);}
            else{
            System.out.println(b+" is greater than "+a);
        }
    }
}
