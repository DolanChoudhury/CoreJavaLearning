package src.basics_03_16Dec;

import java.util.Scanner;

public class Lab_036_037_038 {
    public static void main(String[] args) {
    int age_of_Riya=26;
    int age_of_Naveen=27;

    String elder= age_of_Riya>age_of_Naveen? "Riya is elder": "Naveen is elder";
        System.out.println(elder);

    //Max of two numbers
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int a= sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int b=sc.nextInt();
        String l2= a>b? "1st number is the largest":"Second number is largest";
        System.out.println(l2);
    //Max of three nos
        System.out.println("Enter the 3rd number :");
        int c=sc.nextInt();
        int l3= (a>b)? ((a>c)? a:c)  : ((b>c)?b:c);
        System.out.println(l3 + " is the gratest number");

    }
}
