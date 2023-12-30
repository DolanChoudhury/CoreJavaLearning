package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab_069 {
    public static void main(String[] args) {
        //Solve 3/(a^2+b^2-|c|)

        Scanner details  = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = details.next();


        System.out.println("Enter your age : ");
        String age = details.next();


        System.out.println("Enter your salary : ");
        double Salary =details.nextDouble();

        System.out.println("Your details are- ");
        System.out.println("Name : " +name);
        System.out.println("Age : " +age);
        System.out.println("Salary : " +Salary);


        details.close();
    }
}
