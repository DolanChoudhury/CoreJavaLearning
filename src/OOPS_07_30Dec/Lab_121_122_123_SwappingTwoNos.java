package src.OOPS_07_30Dec;

import java.util.Scanner;

public class Lab_121_122_123_SwappingTwoNos {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter number a:");
        int a = sc.nextInt();
        System.out.println("Enter number b:");
        int b = sc.nextInt();
        System.out.println("Numbers entered are a = "+a+ " b = "+b);

        int c=a;
        a=b;
        b=c;

        System.out.println("Numbers after swapping are a = "+a+ " b = "+b);

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Numbers after swapping again using + & - are a = "+a+ " b = "+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println("Numbers after swapping again using * and / are a = "+a+ " b = "+b);
    }
}
